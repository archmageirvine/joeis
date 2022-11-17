package irvine.oeis.a349;

import irvine.math.z.Z;
import irvine.oeis.a001.A001055;

/**
 * A349907 Number of factorizations of n into odd factors &gt; 1 (a(1) = 1 by convention).
 * @author Georg Fischer
 */
public class A349907 extends A001055 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return ((mN & 1) == 1) ? result : Z.ZERO;
  }
}
