package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a002.A002805;

/**
 * A056612 a(n) = gcd(n!, n!*(1 + 1/2 + 1/3 + ... + 1/n)).
 * @author Sean A. Irvine
 */
public class A056612 extends A000142 {

  private final Sequence mA = new A002805();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

