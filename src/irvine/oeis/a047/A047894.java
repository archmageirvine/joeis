package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000182;

/**
 * A047894 Number of digits of A000182(n).
 * @author Sean A. Irvine
 */
public class A047894 extends A000182 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
