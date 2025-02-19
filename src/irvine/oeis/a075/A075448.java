package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A075448 A075443(n^2)-A075443(n) mod n [i.e., least nonnegative residue].
 * @author Sean A. Irvine
 */
public class A075448 extends Sequence1 {

  private final Sequence mA = new A075443().skip();
  private final Sequence mB = new A075443().skip();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final Z a = mA.next();
    Z b = null;
    while (mM < mN * mN) {
      b = mB.next();
      ++mM;
    }
    return b.subtract(a).modZ(mN);
  }
}
