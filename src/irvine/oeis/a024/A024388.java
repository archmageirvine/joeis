package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A024388 [ (3rd elementary symmetric function of S(n))/(2nd elementary symmetric function of S(n)) ], where S(n) = {first n+2 positive integers congruent to 1 mod 4}.
 * @author Sean A. Irvine
 */
public class A024388 extends Sequence1 {

  private final Sequence mB = new A024379();
  private final Sequence mA = new A024378();
  {
    mA.next();
    mA.next();
    mB.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
