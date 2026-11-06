package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001316;
import irvine.oeis.a006.A006046;

/**
 * A151566 Leftist toothpicks (see Comments for definition).
 * @author Georg Fischer
 */
public class A151566 extends Sequence0 implements DirectSequence {

  private int mN = -1;
  private Z mA;
  private final A001316 mA001316 = new A001316();
  private final A006046 mA006046 = new A006046();

  @Override
  public Z next() {
    // a(2n) = 2*A006046(n), a(2n+1) = a(2n) + A001316(n) = 2*A006046(n) + A001316(n)
    ++mN;
    if ((mN & 1) == 0) {
      mA = mA006046.next().multiply2();
      return mA;
    }
    return mA.add(mA001316.next());
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? mA006046.a(n.divide(2)).multiply2().add(mA001316.a(n.divide(2))) : mA006046.a(n.divide2()).multiply2();
  }

  @Override
  public Z a(final long n) {
    return (n & 1) == 1 ? mA006046.a(n / 2).multiply2().add(mA001316.a(n / 2)) : mA006046.a(n / 2).multiply2();
  }

}
