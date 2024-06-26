package irvine.oeis.a307;
// Generated by gen_seq4.pl 2024-04-17/multrar at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A307874 E.g.f. A(x) satisfies: d/dx A(x) = 1 + A(log(1+x)).
 * @author Georg Fischer
 */
public class A307874 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A307874() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, k -> Functions.STIRLING1.z(n - 1, k).multiply(self.a(k))), "1, 1");
  }
}
