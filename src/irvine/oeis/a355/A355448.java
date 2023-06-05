package irvine.oeis.a355;
// manually dirichcon/dirichcon2 at 2023-06-04 21:23

import irvine.math.z.Z;
import irvine.oeis.a307.A307424;

/**
 * A355448 a(n) = 1 if the number of divisors of n^2 is coprime to 6, otherwise 0.
 * @author Georg Fischer
 */
public class A355448 extends A307424 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
