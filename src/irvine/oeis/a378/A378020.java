package irvine.oeis.a378;
// manually chatest2/multraf at 2026-06-07 21:28

import irvine.math.function.Functions;
import irvine.oeis.a020.A020481;
import irvine.oeis.a020.A020482;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A378020 a(n) = pi(A020482(n)) - pi(A020481(n)).
 * @author Georg Fischer
 */
public class A378020 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A378020() {
    super(1, (self, n) -> Functions.PRIME_PI.z(self.s(0)).subtract(Functions.PRIME_PI.z(self.s(1))), "", new A020482(), new A020481());
    next();
  }
}
