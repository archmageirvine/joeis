package irvine.oeis.a169;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a005.A005238;

/**
 * A169834 Numbers n such that d(n-1) = d(n) = d(n+1).
 * a(n) = A005238(n) + 1. - Jon Maiga
 * @author Georg Fischer
 */
public class A169834 extends A005238 {

  @Override
  public Z next() {
    return super.next().add(Z.ONE);
  } // next
}
