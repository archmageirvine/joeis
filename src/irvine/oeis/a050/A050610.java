package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050610 Sum_{i=0..y} (C(y,i) mod 2)*F(2i+x) = FL(y+x)*A050613(y), where A050613(y) = Product_{i=0..floor(log_2(y+1))} L(2^i)^bit(y,i).
 * @author Sean A. Irvine
 */
public class A050610 extends A050609 {

  @Override
  protected Z t(final int n, final int m) {
    return super.t(m, n); // transpose
  }
}
