package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030635 Numbers with 17 divisors.
 * @author Sean A. Irvine
 */
public class A030635 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(16);
  }
}
