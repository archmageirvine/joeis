package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002722 Rotatable partitions.
 * @author R. J. Mathar
 * @author Sean A. Irvine (conversion to jOEIS framework)
 */
public class A002722 implements Sequence {

  // Dimensionality. Here d=3 means solid partitions.
  private static final int DIMENSION = 3;

  // The number to be partitioned
  private int mN;

  // The solid partition with indices the Cartesian coordinates 0..n-1.
  private short[][][] mY;

  /**
   * Convert serialized index into Cartesian coordinates vector
   * Inverse functionality to <code>x2piv()</code>.
   * @param piv The serialized index in the range <code>0.. n^d-1</code>.
   * @return The three cartesian coordinates, each <code>0<=xi<n</code>.
   */
  private int[] piv2x(int piv) {
    // piv = x1+x2*n+x3^n^2
    final int[] cart = new int[DIMENSION];
    for (int i = 0; i < DIMENSION; ++i) {
      cart[i] = piv % mN;
      piv /= mN;
    }
    return cart;
  }

  /**
   * Convert Cartesian xi vector (i=0..n-1) to serialized index
   * @param cart The coordinates.
   * @return The serialized index.
   */
  private int x2piv(final int[] cart) {
    int piv = cart[cart.length - 1];
    for (int i = cart.length - 2; i >= 0; --i) {
      piv = piv * mN + cart[i];
    }
    return piv;
  }

  /**
   * Check if the y are a rotatable partition
   * @return true if they are
   */
  private boolean isrot() {
    // check all n^3 positions
    for (int piv = 0; piv < mN * mN * mN; ++piv) {
      // locate this in the d coordinate system
      final int[] cart = piv2x(piv);
      // find the rotated position
      final int[] rot = new int[cart.length];
      for (int i = 0; i < rot.length; ++i) {
        rot[i] = cart[(i + 1) % DIMENSION];
      }
      if (mY[rot[0]][rot[1]][rot[2]] != mY[cart[0]][cart[1]][cart[2]]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Check if the y at a position is compatible with its rotated part.
   * @param piv The serialized position now settled.
   * @return true if compatible with the rotated part or if the rotated part is not yet settled.
   */
  private boolean isrotat(final int piv) {
    // locate this in the d coordinate system
    final int[] cart = piv2x(piv);
    // find the rotated position
    final int[] rot = new int[cart.length];
    for (int i = 0; i < rot.length; ++i) {
      rot[i] = cart[(i + 1) % DIMENSION];
    }
    // rotated position not yet settled . y[] comparison impossible.
    return x2piv(rot) >= piv || mY[rot[0]][rot[1]][rot[2]] == mY[cart[0]][cart[1]][cart[2]];
  }

  /**
   * Compute the maximum value in the slots of all neighbours
   * @param piv The upper limit of slots already filled by value.
   * @return The maximum value in these slots
   */
  private int maxNeigh(final int piv) {
    // locate this in the d coordinate system
    final int[] cart = piv2x(piv);
    // because we are dealing with partitions of n, this here is an absolute maximum..to be decremented in the loop.
    int mNei = mN + 1;
    // loop over the neighbours in the i-th direction
    for (int i = 0; i < cart.length; ++i) {
      // neighbour: index one less in Cartesian coordinates
      final int[] neigh = cart.clone();
      if (--neigh[i] < 0) {
        continue;
      }
      // check whether the neighbour has appeared in the sequence earlier sets
      final int pivnei = x2piv(neigh);
      if (pivnei < piv) {
        mNei = Math.min(mNei, mY[neigh[0]][neigh[1]][neigh[2]]);
      }
    }
    return mNei;
  }

  /*
   * Recursive count of rotatable partitions.
   * @param piv The number of y-values already set in the y[][][] blocks.
   * @param nresid The sum of the parts not yet distributed.
   * @return The rotatable partitions that are created by distributing <code>nresid</code> over the n^3-piv remaining parts.
   */
  private long count(final int piv, final int nresid) {
    long ct = 0;
    if (piv == mN * mN * mN) {
      if (nresid != 0) {
        return 0;
      }
      // check rotatable and return 1 if it is. If rotatable is not checked, A000293 results.
      return isrot() ? 1 : 0;
    }

    // restrict part v such that is monotonous with respect to neighbours in all d directions.
    for (short v = 0; v <= Math.min(nresid, maxNeigh(piv)); ++v) {
      // locate this in the d coordinate system
      final int[] cart = piv2x(piv);
      mY[cart[0]][cart[1]][cart[2]] = v;
      if (isrotat(piv)) {
        // put v into the slot and recur to next slot
        ct += count(piv + 1, nresid - v);
      }
    }
    return ct;
  }

  @Override
  public Z next() {
    ++mN;
    mY = new short[mN][mN][mN] ;
    return Z.valueOf(count(0, mN));
  }
}
