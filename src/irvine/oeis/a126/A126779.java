package irvine.oeis.a126;
// Generated by gen_seq4.pl 2025-05-11.ack/lambdan at 2025-05-11 22:56

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A126779 Number of functions f:{1,2,...,n}-&gt;{1,2,...,n} such that Im(f) contains 3 fixed elements.
 * @author Georg Fischer
 */
public class A126779 extends LambdaSequence {

  /** Construct the sequence. */
  public A126779() {
    super(3, n -> Integers.SINGLETON.sum(0, 3, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(3, k)).multiply(Z.valueOf(n - k).pow(n))));
  }
}
