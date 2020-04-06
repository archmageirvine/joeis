package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030631 Numbers with 13 divisors.
 * @author Sean A. Irvine
 */
public class A030631 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(12);
  }
}
