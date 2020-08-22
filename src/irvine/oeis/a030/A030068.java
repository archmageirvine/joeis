package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030068 The "semi-Fibonacci numbers": a(n) = A030067(2n - 1), where A030067 is the semi-Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A030068 extends A030067 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return a(mN);
  }
}
