package irvine.oeis.a359;

import irvine.math.z.Z;
import irvine.oeis.a355.A355690;

/**
 * A359590 Absolute values of A355690, where A355690 is the Dirichlet inverse of the characteristic function of numbers not congruent to 2 mod 4.
 * @author Georg Fischer
 */
public class A359590 extends A355690 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
