package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059724 Second diagonal of A059720.
 * @author Sean A. Irvine
 */
public class A059724 extends A059720 {

  private int mN = 1;

  @Override
  public Z next() {
    return step(++mN)[2];
  }
}

