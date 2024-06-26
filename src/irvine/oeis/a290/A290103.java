package irvine.oeis.a290;
// Generated by gen_seq4.pl 2024-07-01/multrar at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.a028.A028234;
import irvine.oeis.a055.A055396;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A290103 a(n) = LCM of the prime indices in prime factorization of n, a(1) = 1.
 * @author Georg Fischer
 */
public class A290103 extends MultiTransformSequence {

  private static final DirectSequence A028234 = new A028234();
  private static final DirectSequence A055396 = new A055396();

  /** Construct the sequence. */
  public A290103() {
    super(1, (self, n) -> Functions.LCM.z(A055396.a(n), self.a(A028234.a(n).intValueExact())), "1");
  }
}
