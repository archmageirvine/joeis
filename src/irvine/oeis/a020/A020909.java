package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020909 Number of bits in the base-2 representation of the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A020909 extends A000045 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength());
  }
}
