package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002385;

/**
 * A082626 Smallest palindromic prime that ends (the least significant side) in (2n-1) the n-th odd number, or 0 if no such number exists, e.g., for 2n-1 = 10k + 5, k&gt;0.
 * @author Sean A. Irvine
 */
public class A082626 extends Sequence1 {

  private long mMod = 10;
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN > mMod) {
      mMod *= 10;
    }
    if (mN > 5 && mN % 10 == 5) {
      return Z.ZERO;
    }
    final Sequence palin = new A002385();
    while (true) {
      final Z p = palin.next();
      if (p.mod(mMod) == mN) {
        return p;
      }
    }
  }
}
