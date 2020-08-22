package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004694 Fibonacci numbers written in base 13. (Next term contains a non-decimal character).
 * @author Sean A. Irvine
 */
public class A004694 extends A000045 {

  @Override
  public Z next() {
    return new Z(super.next().toString(13));
  }
}

