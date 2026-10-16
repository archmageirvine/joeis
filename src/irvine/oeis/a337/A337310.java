package irvine.oeis.a337;
// manually 2026-10-15/addr at 2026-10-15 

import irvine.math.z.Z;
import irvine.oeis.AdditiveSequence;

/**
 * A337310 Additive function with a(p) = p, a(p^e) = p*a(e) for prime p and e &gt; 1, with a(1) = 1.
 * @author Georg Fischer
 */
public class A337310 extends AdditiveSequence {

  /** Construct the sequence. */
  public A337310() {
    super(1, (self, p, e) -> (e == 1) ? p : self.a(e).multiply(p));
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    return super.a(n);
  }
}
