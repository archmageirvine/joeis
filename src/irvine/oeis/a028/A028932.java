package irvine.oeis.a028;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028932 Triangular array of winning positions in Tchoukaillon (or Mancala) solitaire.
 * @author Sean A. Irvine
 */
public class A028932 implements Sequence {

  // See also A028931.

  protected int[] mStones = new int[0];
  private int mM = 0;

  protected void step() {
    if (mStones.length == 0) {
      mStones = new int[1];
    } else {
      boolean found = false;
      for (int k = 0; k < mStones.length; ++k) {
        if (mStones[k] == 0) {
          mStones[k] = k + 1;
          found = true;
          break;
        } else {
          --mStones[k];
        }
      }
      if (!found) {
        mStones = Arrays.copyOf(mStones, mStones.length + 1);
        mStones[mStones.length - 1] = mStones.length;
      }
    }
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      step();
      mM = mStones.length - 1;
    }
    return Z.valueOf(mStones[mM]);
  }
}

