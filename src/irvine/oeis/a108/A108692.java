package irvine.oeis.a108;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A108692 It is known that 4472988326827347533 is a quadratic non-residue for all primes between 3 and 283; sequence gives 4472988326827347533 mod prime(n).
 * @author Georg Fischer
 */
public class A108692 extends A000040 {

  private static final Z C44 = new Z("4472988326827347533");

  @Override
  public Z next() {
    return C44.mod(super.next());
  }
}
