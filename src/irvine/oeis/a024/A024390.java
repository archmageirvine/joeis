package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024390 [ (4th elementary symmetric function of S(n))/(3rd elementary symmetric function of S(n)) ], where S(n) = {first n+3 positive integers congruent to 1 mod 4}.
 * @author Sean A. Irvine
 */
public class A024390 implements Sequence {

  private final Sequence mB = new A024380();
  private final Sequence mA = new A024379();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
