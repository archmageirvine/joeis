package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004693 Fibonacci numbers written in base <code>12.</code> (Next term contains a non-decimal character.).
 * @author Sean A. Irvine
 */
public class A004693 extends A000045 {

  @Override
  public Z next() {
    return new Z(super.next().toString(12));
  }
}

