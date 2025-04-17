package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a067.A067059;

/**
 * A076822 Number of partitions of the n-th triangular number involving only the numbers 1..n and with exactly n terms.
 * @author Sean A. Irvine
 */
public class A076822 extends A067059 {

  private int mN = -2;

  @Override
  public Z next() {
    return t(++mN, mN + 1);
  }
}

