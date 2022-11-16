package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020912 Number of terms in base 4 representation of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A020912 extends A000045 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf((super.next().bitLength() + 1) / 2);
  }
}
