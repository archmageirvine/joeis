package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059725 Central column in A059720.
 * @author Sean A. Irvine
 */
public class A059725 extends A059720 {

  private int mN = -1;

  @Override
  public Z next() {
    return step(2 * ++mN)[mN];
  }
}

