package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005449;

/**
 * A024399 a(n) = [ (3rd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+2 positive integers congruent to 2 mod 3}.
 * @author Sean A. Irvine
 */
public class A024399 implements Sequence {

  private final Sequence mB = new A024392();
  private final Sequence mA = new A005449();
  {
    mA.next();
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
