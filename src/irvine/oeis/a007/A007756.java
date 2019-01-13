package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007756.
 * @author Sean A. Irvine
 */
public class A007756 implements Sequence {

  // Based on C code at https://github.com/j2b2/TaitCurves
  // C code by J. Betrema

  private static final int STRAND_MAX = 64;
  private static final int PATH_MAX = 32;

  private static final class Diagram {
    private int mCut;
    private final int[] mLength = new int[STRAND_MAX];
    private final int[] mOrientation = new int[STRAND_MAX];
  }

  private int mN = 0;
  private long mCount = 0;
  //private int mPeriod = 0;
  //private final int[] mCountDiagrams = new int[STRAND_MAX + 1];

  /*
   * The 'mOriente' table contains the crossbreeding indices
   * already oriented, its mCut (increasing) is given by 'free'.
   */
  private final int[] mOriente = new int[PATH_MAX];
  private int mFree;


  // Eliminates non-minimal diagrams
  private boolean filter(final int[] t, final int n) {
    return isMinimalCyclic(t, 2 * n);
  }

  void process(final Diagram d) {
    if (!realisable(d)) {
      return;
    }
    ++mCount;
    //++mCountDiagrams[mPeriod];
  }

  private void search(final int[] t, final int n, final int max) {
    final int m = 2 * n;
    final Diagram d = new Diagram();
    while (nextInvolution(t, m)) {
      if (filter(t, n)) {
        saveStrands(d, t, m);
        process(d);
      }
      if (max != 0 && mCount >= max) {
        break;
      }
    }
  }

  /*
   * Record a table 't' of 'n' strands in an address diagram 'd'
   */
  private void saveStrands(final Diagram d, final int[] t, final int n) {
    d.mCut = n / 2;
    System.arraycopy(t, 0, d.mLength, 0, n);
  }

  /*
   * Transforms array 't', with 'n' strands,
   * in a table containing the following involution in the order
   * lexicographic; all strings are of odd length.
   *
   * If the global option 'group' is true,
   * all strings are of length at least equal to the
   * first (t[0]), to increase the probability
   * to obtain minimal involution in its orbit
   * (Experimentally this probability becomes greater than 1/3).
   *
   * The length is measured from the first strand to the second;
   * also calculate the length of the second to the first fact
   * waste more time, experimentally, than to win.
   *
   * This function returns 1 in general (success),
   * and 0 in case of failure, ie: 't' contains the last one
   * involution in the lexicographic order.
   *
   * Assumes the argument 't'
   * contains the first k strings of an involution;
   * the first strand is enough for the k-th path
   * (useful for initialization, with only t[0]).
   */
  private boolean nextInvolution(final int[] t, final int n) {
    int p;
    for (int i = n - 1; i >= 0; --i) {
      while (i > 0 && t[i] <= 0) {
        --i;
      }
      p = i + t[i];
      if (i == 0 && p > n - 4) {
        return false;
      }

      // Lengthen the path i -> p
      t[p++] = 0;
      if (++p < n) {
        if (completeInvolution(t, n, i, p)) {
          return true;
        }
      }
      t[i] = 0;  // Failure: Erase the path before going to the previous one
    }
    return false;
  }

  /*
   * Completes a table 't' of 'n' strands,
   * which contains the first k strings of an involution,
   * in the smallest involution in the lexicographic order.
   *
   * 'i' is the index of the first free strand, and 'p' is the minimum index
   * his twin; all strings are of odd length;
   *
   * This function returns true on success, and false on failure
   * i.e.: there is no involution that completes t '.
   */
  private boolean completeInvolution(final int[] t, final int n, final int i, int p) {
    for (; p < n; ++p) {
      if (t[p] == 0) {
        t[i] = p - i;
        t[p] = -t[i];

        //Calculate the index 'j' of the first free strand
        int j;
        for (j = i; j < n && t[j] != 0; ++j) {
          // do nothing
        }
        if (j < n) {
          final int q = j + t[0];
          if (q < n && completeInvolution(t, n, j, q)) {
            return true;
          }
          t[p] = 0; // Failure to erase the trail before lengthening it
        } else {
          return true; // Lengthening is complete
        }
      }
      ++p;
    }
    t[i] = 0;  // Impossible to complete the involution from the strand i
    return false;
  }

  /*
   * Simplified version of minimumCyclic, which indicates only
   * whether or not the involution is minimal in its cyclical orbit.
   */
  private boolean isMinimalCyclic(final int[] t, final int n) {
    int i = 0;
    int p = 0;
    int j = 1;
    int q = 1;
    boolean egalite = false;
    //mPeriod = n;
    while (q < n) {
      // We compare the segments t [i..p] and t [j..q], knowing that t [i..p-1] = t [j..q-1]
      egalite = false;
      int x = t[p];
      if (x < 0) {
        x += n;
      }
      int y = t[q];
      if (y < 0) {
        y += n;
      }

      if (x < y) {
        p = i;
        j = ++q;
      } else if (x == y) {
        ++p;
        ++q;
        egalite = true;
      } else {
        i = j;
        break;
      }
    }

    if (i > 0) {
      return false;  // non-minimal table
    }
    if (!egalite) {
      return true;
    }

    // Continue circular comparison
    q = 0;
    while (p < n) {
      int x = t[p];
      if (x < 0) {
        x = x + n;
      }
      int y = t[q];
      if (y < 0) {
        y = y + n;
      }

      if (x < y) {
        return true;
      } else if (x == y) {
        ++p;
        ++q;
      } else {
        return false;
      }
    }
    //mPeriod = q;
    return true;
  }

  /*
   * A path (i, p) is also a circuit i-> p,
   * analyzed by this function, which assumes that
   * 1. i <p and 2. the crossing (i, p) is already orientated.
   *
   * A lobe is an internal circuit j-> q
   * (i <j <q <p) where I do not belong to a lobe
   * (the lobes do not overlap).
   *
   * If there is no lobel, the sequence of strands [i, i + 1, ..., p-1]
   * forms a Jordan curve;
   * otherwise, for each lobe j-> q, it is necessary to withdraw from the circuit
   * the sequence of strands [j, j + 1, ..., q-1] to obtain a Jordan curve.
   */
  private boolean circuit(final Diagram d, final int i) {
    final int n = 2 * d.mCut;
    final int[] lobe = new int[STRAND_MAX]; // index of the enveloping lobe, otherwise 0

    final int p = d.mLength[i] + i;
    int epsilon = d.mOrientation[i];

    // Mark the lobes of the circuit i-> p
    for (int j = i + 1; j < p; ) {
      final int q = d.mLength[j] + j;
      if (j < q && q < p) {  // lobe
        for (int k = j; k < q; ++k) {
          lobe[k] = j;
        }
        j = q;
      } else {
        lobe[j++] = 0;
      }
    }

    // Now the strand q travels circularly the circuit p->i,
    // and each string (j, q) with i < j < p allows to orient
    // the crossing (j, q) or a lobe, using the position
    // Strand q with respect to the Jordan curve.
    for (int t = p + 1; t < i + n; ++t) {
      int q = t < n ? t : t - n;
      int j = d.mLength[q] + q;
      if (j < i || j > p) {
        continue; // unsatisfactory path
      }

      final int omega;
      if (lobe[j] != 0) {
        int lobeJordan = 1;
        final int a = lobe[j];
        final int b = d.mLength[a] + a;
        // Orient the lobe, ie. crossing (a, b), starting by taking into account
        // crosses between the lobe and the Jordan curve.
        for (int k = a + 1; k < j; ++k) {
          final int r = d.mLength[k] + k;
          if (i < r && r < p && lobe[r] == 0) {
            lobeJordan = -lobeJordan;
          }
        }
        omega = -epsilon * lobeJordan;
        j = a;
        q = b;
      } else {
        // Crossing (j, q), where j is a strand of Jordan's curve:
        // strands q-1 and q are on both sides of this curve
        epsilon = -epsilon;
        omega = epsilon;
      }

      // Now we can orient the crossing (j, q);
      // If it is already oriented one tests a possible contradiction.
      final int e = d.mOrientation[j];
      if (e != 0) {
        if (e != omega) {
          return false;
        }
      } else {
        d.mOrientation[j] = omega;
        d.mOrientation[q] = -omega;
        mOriente[mFree++] = j < q ? j : q;
      }
    }
    return true;
  }

  /*
   * Calculates the orientations of the crossings of the Gauss curve
   * associated with a string diagram, if it exists.
   *
   * Stops as soon as:
   * 1) all crossings (= strings) are oriented,
   * or 2) a contradiction appears,
   * or 3) the algorithm no longer progresses.
   *
   * Returns the number of strings oriented, which makes it possible to distinguish
   * 1) and 3); case 3) means that the diagram is not connected.
   * Case 2) is indicated by the value of 'ok'.
   *
   * Case 1) does not mean that no contradiction would have appeared
   * by continuing the execution of the algorithm, nor that the diagram
   * is feasible: it is still necessary to calculate the number of faces.
   */
  private int orienter(final Diagram d, final boolean[] ok) {
    final int n = 2 * d.mCut;

    for (int i = 1; i < n; ++i) {
      d.mOrientation[i] = 0;
    }

    d.mOrientation[0] = 1;
    d.mOrientation[d.mLength[0]] = -1;
    mOriente[0] = 0;
    mFree = 1;

    for (int i = 0; i < mFree; ++i) {
      ok[0] = circuit(d, mOriente[i]);
      if (!ok[0] || mFree >= d.mCut) {
        return mFree;
      }
    }
    return mFree;
  }

  private boolean realisable(final Diagram d) {
    final boolean[] ok = new boolean[1];
    final int n = d.mCut;
    return orienter(d, ok) >= n && ok[0] && nbFaces(d) == n + 2;
  }

  private int nbFaces(final Diagram d) {
    int f = 0;
    final int n = 2 * d.mCut;
    final int[] passage = new int[STRAND_MAX];
    /*  For each strand i, passage [i] is:
     *  0 if the strand was not traveled
     *  1 if the strand was traveled in the positive direction
     * -1 if the strand was traveled in the negative direction
     *  2 if the strand was traveled in both directions
     */
    for (int i = 0; i < n; ) {
      if (passage[i] < 2) {
        ++f;
        final int depart = passage[i] <= 0 ? 1 : -1;
        int j = i;
        int sense = depart;
        do {
          passage[j] = passage[j] != 0 ? 2 : sense;
          j += sense;

          // note: circular path
          if (j == n) {
            j = 0;
          } else if (j < 0) {
            j = n - 1;
          }

          if (d.mOrientation[j] < 0) {
            sense = -sense;
          }
          j = d.mLength[j] + j; // other end of the path
        } while (j != i || sense != depart);
      }
      if (passage[i] == 2) {
        ++i;
      }
    }
    return f;
  }

  @Override
  public Z next() {
    final int[] t = new int[STRAND_MAX];
    t[0] = 1;
    mCount = 0;
    search(t, ++mN, 0);
    return Z.valueOf(mCount);
  }
}
