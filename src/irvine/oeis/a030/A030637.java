package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030637 Numbers with 19 divisors.
 * @author Sean A. Irvine
 */
public class A030637 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(18);
  }
}
