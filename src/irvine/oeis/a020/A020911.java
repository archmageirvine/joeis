package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020911 Number of digits in the base 3 representation of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A020911 extends A000045 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString(3).length());
  }
}
