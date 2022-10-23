package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005449;

/**
 * A024400 [ (4th elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+3 positive integers congruent to 2 mod 3}.
 * @author Sean A. Irvine
 */
public class A024400 extends Sequence1 {

  private final Sequence mB = new A024393();
  private final Sequence mA = new A005449();
  {
    mA.next();
    mA.next();
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
