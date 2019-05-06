package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020913 Number of terms in base 5 representation of <code>Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A020913 extends A000045 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString(5).length());
  }
}
