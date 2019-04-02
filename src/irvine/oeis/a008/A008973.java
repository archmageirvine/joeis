package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A008973 Fibonacci number F(n) to power F(n).
 * @author Sean A. Irvine
 */
public class A008973 extends A000045 {

  @Override
  public Z next() {
    final Z f = super.next();
    return f.pow(f.intValueExact());
  }
}

