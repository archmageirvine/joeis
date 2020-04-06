package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030629 Numbers with 11 divisors.
 * @author Sean A. Irvine
 */
public class A030629 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(10);
  }
}
