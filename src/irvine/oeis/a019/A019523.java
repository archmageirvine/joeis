package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A019523 Concatenation of <code>Fibonacci(1)</code> through <code>Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A019523 extends A000045 {

  private final StringBuilder mS = new StringBuilder();
  {
    super.next();
  }

  @Override
  public Z next() {
    mS.append(super.next());
    return new Z(mS);
  }
}

