package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039929 Second column of Fibonacci Jabotinsky-triangle A039692.
 * @author Sean A. Irvine
 */
public class A039929 extends A039692 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
