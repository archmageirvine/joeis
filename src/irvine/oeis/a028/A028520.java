package irvine.oeis.a028;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000521;

/**
 * A028520 Character of extremal vertex operator algebra of rank 48.
 * @author Sean A. Irvine
 */
public class A028520 implements Sequence {

  private int mN = -3;
  private final ArrayList<Z> mC = new ArrayList<>();
  private final A000521 mCSeq = new A000521();

  private Z c(final int n) {
    if (n < -1) {
      return Z.ZERO;
    }
    while (n + 1 >= mC.size()) {
      mC.add(mCSeq.next());
    }
    return mC.get(n + 1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if ((mN & 1) == 0) {
      return c(2 * mN).multiply2().add(c(mN / 2));
    } else {
      return c(2 * mN).multiply2();
    }
  }
}
