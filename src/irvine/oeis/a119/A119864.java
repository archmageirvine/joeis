package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.a281.A281502;

/**
 * A119864 Numbers m such that the numerator of BernoulliB(m) is divisible by 691.
 * @author Georg Fischer
 */
public class A119864 extends A281502 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
