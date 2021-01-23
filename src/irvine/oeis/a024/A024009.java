package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008455;

/**
 * A024009 a(n) = 1 - n^11.
 * @author Sean A. Irvine
 */
public class A024009 extends A008455 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
