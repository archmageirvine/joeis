package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024223 [ (4th elementary symmetric function of S(n))/(2nd elementary symmetric function of S(n)) ], where S(n) = {first n+3 positive integers congruent to 1 mod 3}.
 * @author Sean A. Irvine
 */
public class A024223 extends A024214 {

  private final Sequence mA = new A024212().skip(2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

