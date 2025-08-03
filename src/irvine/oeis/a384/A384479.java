package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A384479 a(n) is the number of ways to partition n X n X n cube into 5 noncongruent cuboids.
 * @author Sean A. Irvine
 */
public class A384479 extends A386296 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

