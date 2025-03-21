package irvine.oeis.a194;
// Generated by gen_seq4.pl triprodm/lambdas at 2023-07-31 14:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A194821 a(n) = 1+floor(Sum_{k=1..n} &lt;((-1)^k)*k*sqrt(2)&gt;), where &lt; &gt; = fractional part.
 * @author Georg Fischer
 */
public class A194821 extends LambdaSequence {

  /** Construct the sequence. */
  public A194821() {
    super(1, n -> Z.ONE.add(ComputableReals.SINGLETON.sum(1, n, k -> CR.SQRT2.multiply(CR.valueOf(((k & 1) == 0) ? k : -k)).frac()).floor()));
  }
}
