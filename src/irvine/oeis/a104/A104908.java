package irvine.oeis.a104;
// Generated by gen_seq4.pl 2024-04-17/multrar at 2024-04-17 19:29

import irvine.math.cr.CR;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A104908 a(n) = floor(sqrt(a(n-1)^2 + a(n-2)^2)), a(1)=100, a(2)=300.
 * @author Georg Fischer
 */
public class A104908 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A104908() {
    super(1, (self, n) -> CR.valueOf(self.a(n - 1).square().add(self.a(n - 2).square())).sqrt().floor(), "100, 300");
  }
}
