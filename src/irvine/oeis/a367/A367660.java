package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-05-11/multrar at 2024-05-11 21:20

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A367660 G.f. A(x) satisfies A(x) = 1 / (1 - x - x * A(x^4)).
 * @author Georg Fischer
 */
public class A367660 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A367660() {
    super(0, (self, n) -> self.a(n - 1).add(Integers.SINGLETON.sum(0, (n - 1) / 4, k -> self.a(k).multiply(self.a(n - 1 - 4 * k)))), "1");
  }
}
