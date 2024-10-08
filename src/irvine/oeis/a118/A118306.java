package irvine.oeis.a118;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a003.A003961;
import irvine.oeis.a055.A055396;
import irvine.oeis.a064.A064989;

/**
 * A118306 If n = product{k&gt;=1} p(k)^b(n,k), where p(k) is the k-th prime and where each b(n,k) is a nonnegative integer, then: If n occurs earlier in the sequence, then a(n) = product{k&gt;=2} p(k-1)^b(n,k); If n does not occur earlier in the sequence, then a(n) = product{k&gt;=1} p(k+1)^b(n,k).
 * @author Georg Fischer
 */
public class A118306 extends LambdaSequence {

  private static final DirectSequence A003961 = new A003961();
  private static final DirectSequence A055396 = new A055396();
  private static final DirectSequence A064989 = new A064989();

  /** Construct the sequence. */
  public A118306() {
    super(1, n -> (n <= 1) ? Z.ONE : (A055396.a(n).testBit(0) ? A003961.a(n) : A064989.a(n)));
  }
}
