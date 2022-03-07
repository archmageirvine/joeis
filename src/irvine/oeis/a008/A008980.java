package irvine.oeis.a008;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008980 Number of immersions of the oriented circle into the oriented plane with n double points.
 * @author Sean A. Irvine
 */
public class A008980 implements Sequence {

  // Based on Pascal program allcurve.pas.
  // Original documentation:

  /*
   * Program by F.S.Duzhin, fduzhin@mccme.ru, January 1998.
   * Ported to GNU Pascal by S.V.Duzhin.
   *
   * Enumeration of closed curves in the plane in the sense of
   * V.I.Arnold "Topological Invariants of Plane Curves and Caustics",
   * University Lecture Series, v.5, AMS 1994.
   *
   * Algorithm of counting long curves by S.M.Gusein-Zade (1994)
   * Algorithm of counting closed curves by F.S.Duzhin (1998)
   *
   * Published in:
   * S.M.Gusein-Zade, F.S.Duzhin. On the number of topological types
   * of plane curves. (Russian) Uspekhi Mat. Nauk 53 (1998),
   * no. 3(321), 197--198.
   */

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  /* The arc in the diagram */
  private static final class Arc {
    private int mWhere; /* Number of another vertex of an arc */
    private int mUp; /* 1 if arc is up and 0 if arc is down */
  }

  private static final class Curve {
    /* The diagram of the curve */
    private int mNumCross; /* Number of self-intersections */
    private final Arc[] mArcs;
    private int mDir; /* The direction of the curve: 0 - to left, 1 - to right */

    private Curve(final int size) {
      mArcs = new Arc[2 * size + 1];
      for (int k = 1; k < mArcs.length; ++k) {
        mArcs[k] = new Arc();
      }
      mNumCross = 0;
      mDir = 0;
    }

    private Curve(final Arc[] arcs) {
      mArcs = new Arc[arcs.length];
      for (int k = 0; k < arcs.length; ++k) {
        if (arcs[k] != null) {
          mArcs[k] = new Arc();
          mArcs[k].mWhere = arcs[k].mWhere;
          mArcs[k].mUp = arcs[k].mUp;
        }
      }
    }

    private Curve copy() {
      final Curve res = new Curve(mArcs);
      res.mNumCross = mNumCross;
      res.mDir = mDir;
      return res;
    }
  }

  /**
   * Container for curves.
   */
  public static final class AllCurves {

    private final int mMaxCross;
    private final Curve[] mCurves;
    private final int[][] mIndices;
    /* indices[i] corresponds to line segments' indices for curves[i] */
    private final boolean[][] mUpConnect;
    private final boolean[][] mDownConnect;

    private final long[][] mR2S;
    protected final long[][] mR2;
    protected final long[][] mS;
    public final long[][] mNoOrient;
    /* results in cases when oriented are a plane and a circle, a plane, a circle and nothing */
    private int mCurrent;
    //private long res;

    private AllCurves(final int maxCross) {
      mMaxCross = maxCross;
      mCurves = new Curve[maxCross + 1];
      for (int k = 0; k < mCurves.length; ++k) {
        mCurves[k] = new Curve(maxCross);
      }
      mIndices = new int[maxCross + 1][2 * maxCross + 2];
      mUpConnect = new boolean[maxCross + 1][2 * maxCross + 2];
      mDownConnect = new boolean[maxCross + 1][2 * maxCross + 2];
      mR2S = new long[maxCross + 1][4 * maxCross + 1];
      mR2 = new long[maxCross + 1][4 * maxCross + 1];
      mS = new long[maxCross + 1][4 * maxCross + 1];
      mNoOrient = new long[maxCross + 1][4 * maxCross + 1];
    }

    private boolean equal(final Curve c1, final Curve c2) {
      if (c1.mNumCross != c2.mNumCross) {
        return false;
      }
      int i = 1;
      while (i <= 2 * c1.mNumCross && c1.mArcs[i].mWhere == c2.mArcs[i].mWhere && c1.mArcs[i].mUp == c2.mArcs[i].mUp) {
        ++i;
      }
      return i == 2 * c1.mNumCross + 1;
    }

    /* Calculating indices of line-segments for the given curve */
    private void putIndices(final Curve c, final int[] n) {
      int i = 2 * c.mNumCross;
      int k = 1;
      n[i + 1] = k;
      int direction = -1;
      while (i > 0) {
        ++k;
        i = c.mArcs[i].mWhere;
        direction = -direction;
        if (direction == -1) {
          n[i] = k;
        } else {
          n[i + 1] = k;
        }
        i += direction;
      }
    }

    private void lookForFreeSegments(final Curve c, final boolean[] connect, final int side) {
      int l = 1;
      int r = 1;
      connect[1] = true;
      connect[2 * c.mNumCross + 1] = true;
      while (r <= 2 * c.mNumCross) {
        if (c.mArcs[r].mUp == side && c.mArcs[r].mWhere > r) {
          r = c.mArcs[r].mWhere;
          while (l <= r) {
            connect[++l] = false;
          }
          l = r;
        } else {
          ++r;
          connect[++l] = true;
        }
      }
    }

    private void makeArc(final Curve h, final Curve c, final int segment, final int side) {
      c.mNumCross = h.mNumCross + 1;
      for (int i = 2 * c.mNumCross - 1; i >= segment + 1; --i) {
        c.mArcs[i].mUp = h.mArcs[i - 1].mUp;
        c.mArcs[i].mWhere = h.mArcs[i - 1].mWhere >= segment ? h.mArcs[i - 1].mWhere + 1 : h.mArcs[i - 1].mWhere;
      }
      for (int i = 1; i < segment; ++i) {
        c.mArcs[i].mWhere = h.mArcs[i].mWhere >= segment ? h.mArcs[i].mWhere + 1 : h.mArcs[i].mWhere;
        c.mArcs[i].mUp = h.mArcs[i].mUp;
      }
      c.mArcs[segment].mWhere = 2 * c.mNumCross;
      c.mArcs[segment].mUp = side;
      c.mArcs[2 * c.mNumCross].mWhere = segment;
      c.mArcs[2 * c.mNumCross].mUp = side;
    }

    private void remakeCurve(final Curve c, final int[] ind) {
      final Curve h = c.copy();
      final int cut = c.mArcs[2 * c.mNumCross].mUp == 1 ? 2 * c.mNumCross - 1 : c.mArcs[2 * c.mNumCross].mWhere - 1;
      if ((ind[cut + 1] & 1) == 0) {
        c.mDir = 1 - c.mDir;
      }
      for (int i = 1; i <= cut; ++i) {
        c.mArcs[i + 2 * c.mNumCross - cut].mWhere = h.mArcs[i].mWhere <= cut ? h.mArcs[i].mWhere + 2 * c.mNumCross - cut : h.mArcs[i].mWhere - cut;
        c.mArcs[i + 2 * c.mNumCross - cut].mUp = h.mArcs[i].mUp;
      }
      for (int i = cut + 1; i <= 2 * c.mNumCross; ++i) {
        c.mArcs[i - cut].mWhere = h.mArcs[i].mWhere > cut ? h.mArcs[i].mWhere - cut : h.mArcs[i].mWhere + 2 * c.mNumCross - cut;
        c.mArcs[i - cut].mUp = h.mArcs[i].mUp;
      }
    }

    private void killArc(final Curve c, final int[] ind, final int[] index, final int[] side) {
      /* side - a new side of a killed arc */
      /* index  - an index of a segment mWhere a killed arc needs to go */
      final Curve h = c.copy();

      if ((ind[c.mArcs[2 * c.mNumCross].mWhere] & 1) == 1) {
        c.mNumCross = c.mNumCross - 1;
        for (int i = 1; i <= h.mArcs[2 * h.mNumCross].mWhere - 1; ++i) {
          final int add1 = i < h.mArcs[2 * h.mNumCross].mWhere ? 0 : 1;
          final int add2 = h.mArcs[i].mWhere < h.mArcs[2 * h.mNumCross].mWhere ? 0 : 1;
          c.mArcs[i - add1].mWhere = h.mArcs[i].mWhere - add2;
          c.mArcs[i - add1].mUp = h.mArcs[i].mUp;
        }
        for (int i = h.mArcs[2 * h.mNumCross].mWhere + 1; i <= 2 * h.mNumCross - 1; ++i) {
          final int add1 = i < h.mArcs[2 * h.mNumCross].mWhere ? 0 : 1;
          final int add2 = h.mArcs[i].mWhere < h.mArcs[2 * h.mNumCross].mWhere ? 0 : 1;
          c.mArcs[i - add1].mWhere = h.mArcs[i].mWhere - add2;
          c.mArcs[i - add1].mUp = h.mArcs[i].mUp;
        }
        side[0] = h.mArcs[2 * h.mNumCross].mUp;
        index[0] = ind[2 * h.mNumCross] - 1;
      } else {
        final int border = h.mArcs[2 * h.mNumCross].mWhere; // It is a border between a line and a circle
        side[0] = 1 - h.mArcs[2 * h.mNumCross].mUp;

        /* Now we have to find the first arc which goes from line to circle */
        int j = border - 1;
        while (j > 0 && h.mArcs[j].mWhere < border) {
          --j;
        }
        /* If i=0 then a mistake has happened */
        final int firstArc = j; // It is a first from left arc which goes from line to circle

        /* Now we'll make a new diagram */
        c.mNumCross = h.mNumCross - 1;
        for (int i = 1; i <= firstArc - 1; ++i) {
          if (h.mArcs[i].mWhere < firstArc) {
            c.mArcs[i] = h.mArcs[i];
          } else if (h.mArcs[i].mWhere < border) {
            c.mArcs[i].mWhere = h.mArcs[i].mWhere + 2 * h.mNumCross - border - 1;
            c.mArcs[i].mUp = h.mArcs[i].mUp;
            c.mArcs[c.mArcs[i].mWhere].mWhere = i;
            c.mArcs[c.mArcs[i].mWhere].mUp = c.mArcs[i].mUp;
          } else {
            c.mArcs[i].mWhere = h.mArcs[i].mWhere - (h.mArcs[firstArc].mWhere - border) - (border - firstArc);
            c.mArcs[i].mUp = h.mArcs[i].mUp;
            c.mArcs[c.mArcs[i].mWhere].mWhere = i;
            c.mArcs[c.mArcs[i].mWhere].mUp = c.mArcs[i].mUp;
          }
        }
        c.mArcs[firstArc].mWhere = 2 * h.mNumCross - (border - firstArc) - 1;
        c.mArcs[firstArc].mUp = 1 - side[0];
        c.mArcs[c.mArcs[firstArc].mWhere].mWhere = firstArc;
        c.mArcs[c.mArcs[firstArc].mWhere].mUp = 1 - side[0];
        for (int i = firstArc + 1; i <= border - 1; ++i) {
          if (h.mArcs[i].mWhere < border && h.mArcs[i].mWhere > i) {
            final int add1 = i + 2 * h.mNumCross - border - 1;
            final int add2 = h.mArcs[i].mWhere + 2 * h.mNumCross - border - 1;
            c.mArcs[add1].mWhere = add2;
            c.mArcs[add2].mWhere = add1;
            c.mArcs[add1].mUp = h.mArcs[i].mUp;
            c.mArcs[add2].mUp = c.mArcs[add1].mUp;
          }
        }
        for (int i = border + 1; i <= 2 * h.mNumCross - 1; ++i) {
          if (h.mArcs[i].mWhere > border && i < h.mArcs[i].mWhere) {
            final int add1;
            if (i < h.mArcs[firstArc].mWhere) {
              add1 = 2 * h.mNumCross - (h.mArcs[firstArc].mWhere - i) - (border - firstArc) - 1;
            } else {
              add1 = border + i - h.mArcs[firstArc].mWhere - (border - firstArc);
            }
            final int add2;
            if (h.mArcs[i].mWhere < h.mArcs[firstArc].mWhere) {
              add2 = 2 * h.mNumCross - (h.mArcs[firstArc].mWhere - h.mArcs[i].mWhere) - (border - firstArc) - 1;
            } else {
              add2 = border + h.mArcs[i].mWhere - h.mArcs[firstArc].mWhere - (border - firstArc);
            }
            c.mArcs[add1].mWhere = add2;
            c.mArcs[add1].mUp = h.mArcs[i].mUp;
            c.mArcs[add2].mWhere = add1;
            c.mArcs[add2].mUp = c.mArcs[add1].mUp;
          }
        }
        index[0] = ind[border] - 1;
      }
    }

    private void normalizeCurve(final Curve c, final int[] ind) {
      if (c.mNumCross > 2) {
        final int[] index = new int[1];
        final int[] side = new int[1];
        killArc(c, ind, index, side);
        putIndices(c, ind);
        normalizeCurve(c, ind);
        final Curve h = c.copy();
        int i = 1;
        while (ind[i] != index[0]) {
          ++i;
        }
        makeArc(h, c, i, side[0]);
        putIndices(c, ind);
      }
    }

    private void overturnCurve(final Curve c) {
      final Curve h = c.copy();
      for (int i = 1; i <= 2 * c.mNumCross; ++i) {
        c.mArcs[i].mWhere = 2 * c.mNumCross - h.mArcs[2 * c.mNumCross - i + 1].mWhere + 1;
        c.mArcs[i].mUp = h.mArcs[2 * c.mNumCross - i + 1].mUp;
      }
      c.mDir = 1 - h.mDir;
    }

    /* The step from a given curve to nextQ one with one more points of self-
       intersection. The arc is added in agree with parameters segment and side */
    private void curveUp(final int segment, final int side) {
      final int[] symind = new int[2 * mMaxCross + 2];
      ++mCurrent;
      makeArc(mCurves[mCurrent - 1], mCurves[mCurrent], segment, side);
      putIndices(mCurves[mCurrent], mIndices[mCurrent]);
      if (mCurrent < mMaxCross) {
        mCurves[mCurrent + 1].mNumCross = 0;
      }
      final Curve h = mCurves[mCurrent].copy();
      final int[] ind = mIndices[mCurrent];
      final Curve symm = h.copy();
      overturnCurve(symm);
      putIndices(symm, symind);
      normalizeCurve(symm, symind);
      int i = 0;
      int coef = 2;
      int coefs = 2;
      do {
        remakeCurve(h, ind);
        putIndices(h, ind);
        normalizeCurve(h, ind);
        if (coef == 2 && equal(h, symm)) {
          coef = 1;
          if (h.mDir != symm.mDir) {
            coefs = 1;
          }
        }
        ++i;
      } while (!equal(h, mCurves[mCurrent]));
      if (h.mDir != mCurves[mCurrent].mDir && coef == 1) {
        /* [f]=[Sfs]=[fs]=[Sf] */
        mR2S[mCurrent][i] = mR2S[mCurrent][i] + 1;
        mR2[mCurrent][i] = mR2[mCurrent][i] + 1;
        mS[mCurrent][i] = mS[mCurrent][i] + 1;
        mNoOrient[mCurrent][i] = mNoOrient[mCurrent][i] + 1;
      } else if (h.mDir == mCurves[mCurrent].mDir && coefs == 1) {
        /* [f]=[Sfs],[fs]=[Sf] */
        mR2S[mCurrent][i] = mR2S[mCurrent][i] + 2;
        mR2[mCurrent][i] = mR2[mCurrent][i] + 1;
        mS[mCurrent][i] = mS[mCurrent][i] + 1;
        mNoOrient[mCurrent][i] = mNoOrient[mCurrent][i] + 1;
      } else if (h.mDir != mCurves[mCurrent].mDir && coef == 2) {
        /* [f]=[fs],[Sfs]=[Sf] */
        mR2S[mCurrent][i] = mR2S[mCurrent][i] + 1;
        mR2[mCurrent][i] = mR2[mCurrent][i] + 1;
        mS[mCurrent][2 * i] = mS[mCurrent][2 * i] + 1;
        mNoOrient[mCurrent][2 * i] = mNoOrient[mCurrent][2 * i] + 1;
      } else if (h.mDir == mCurves[mCurrent].mDir && coef == 1) {
        /* [f]=[Sf],[fs]=[Sfs] */
        mR2S[mCurrent][i] = mR2S[mCurrent][i] + 2;
        mR2[mCurrent][i] = mR2[mCurrent][i] + 1;
        mS[mCurrent][i] = mS[mCurrent][i] + 2;
        mNoOrient[mCurrent][i] = mNoOrient[mCurrent][i] + 1;
      } else {
        /* [f],Sf],[fs],[Sfs] */
        mR2S[mCurrent][i] = mR2S[mCurrent][i] + 2;
        mR2[mCurrent][i] = mR2[mCurrent][i] + 1;
        mS[mCurrent][i] = mS[mCurrent][i] + 1;
        mNoOrient[mCurrent][2 * i] = mNoOrient[mCurrent][2 * i] + 1;
      }
      lookForFreeSegments(mCurves[mCurrent], mUpConnect[mCurrent], 1);
      lookForFreeSegments(mCurves[mCurrent], mDownConnect[mCurrent], 0);
    }

    private void curveDown() {
      mCurrent = mCurrent - 1;
    }

    private void start() {
      mCurrent = 0;
      putIndices(mCurves[0], mIndices[0]);
      lookForFreeSegments(mCurves[0], mUpConnect[1], 1);
      lookForFreeSegments(mCurves[0], mDownConnect[1], 0);
      mR2S[0][1] = 2;
      mR2[0][1] = 1;
      mS[0][1] = 1;
      mNoOrient[0][1] = 1;
    }

    private long sum(final long[] v) {
      long sum = 0;
      for (int k = 1; k < v.length; ++k) {
        sum += v[k] / k;
      }
      return sum;
    }

    private void printResults() {
      System.out.println("                          CLOSED CURVES                       LONG");
      System.out.println("           both        plane       circle      nothing       CURVES");
      for (int i = 0; i <= mMaxCross; ++i) {
        final String sb = String.valueOf(i) + '\t' + sum(mR2S[i]) + '\t' + sum(mR2[i]) + '\t' + sum(mS[i]) + '\t' + sum(mNoOrient[i]) + '\t' + LongUtils.sum(mNoOrient[i]);
        System.out.println(sb);
      }
    }

    private void run() {
      curveUp(1, 1);
      while (mCurrent >= 0) {
        if (mCurrent == mMaxCross) {
          curveDown();
        } else if (mCurves[mCurrent + 1].mNumCross == 0) {
          curveUp(2 * mCurrent + 1, 1);
        } else {
          int i = mCurves[mCurrent + 1].mArcs[2 * mCurrent + 2].mWhere - 1;
          if (mCurves[mCurrent + 1].mArcs[2 * mCurrent + 2].mUp == 1) {
            while (i > 0 && !(mUpConnect[mCurrent][i] && (mIndices[mCurrent][i] & 1) == 1)) {
              --i;
            }
            if (i == 0) {
              curveUp(2 * mCurrent + 1, 0);
            } else {
              curveUp(i, 1);
            }
          } else {
            while (i > 0 && !(mDownConnect[mCurrent][i] && (mIndices[mCurrent][i] & 1) == 1)) {
              --i;
            }
            if (i == 0) {
              curveDown();
            } else {
              curveUp(i, 0);
            }
          }
        }
      }
      if (VERBOSE) {
        printResults();
      }
    }
  }

  // The code actually computes everything up to a specified value.  So we step by 5
  // at a time, but this will be extremely slow to get more than 10 terms.

  protected int mN = -1;
  protected AllCurves mAllCurves = new AllCurves(5);
  {
    mAllCurves.start();
    mAllCurves.run();
  }

  protected long[] select(final int n) {
    return mAllCurves.mR2S[n];
  }

  @Override
  public Z next() {
    ++mN;
    if (mN >= mAllCurves.mR2S.length) {
      mAllCurves = new AllCurves(mN + 4);
      mAllCurves.start();
      mAllCurves.run();
    }
    return Z.valueOf(mAllCurves.sum(select(mN)));
  }

  /**
   * Compute several related sequences.
   * @param args maximum row to print
   */
  public static void main(final String[] args) {
    final AllCurves curves = new AllCurves(Integer.parseInt(args[0]));
    curves.start();
    curves.run();
    curves.printResults();
  }
}

