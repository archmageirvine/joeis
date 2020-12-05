package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037030 Numbers n such that 666*n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A037030 extends A037029 {

  @Override
  public Z next() {
    return super.next().divide(666);
  }
}

