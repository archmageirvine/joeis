package irvine.oeis.a028;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000521;

/**
 * A028521 Character of extremal vertex operator algebra of rank 72.
 * @author Sean A. Irvine
 */
public class A028521 implements Sequence {

  private int mN = -4;
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
    Z r = c(mN);
    r = r.add(c(3 * mN).multiply(3));
    if (mN % 3 == 0) {
      r = r.add(c(mN / 3));
    }
    return r;
  }
}
