package irvine.oeis.a247;
// Generated by gen_seq4.pl 2024-05-29/multrar at 2024-05-29 02:16

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A247084 a(n)=0 when n&lt;=0: Starting with n=1, a(n) = 1 + the sum of the digital sums of a(0) through a(n-4).
 * @author Georg Fischer
 */
public class A247084 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A247084() {
    super(0, (self, n) -> Z.ONE.add(Integers.SINGLETON.sum(0, n - 4, k -> Functions.DIGIT_SUM.z(self.a(k)))), "0");
  }
}
