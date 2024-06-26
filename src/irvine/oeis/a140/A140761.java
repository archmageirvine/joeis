package irvine.oeis.a140;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a051.A051838;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A140761 Primes p(j) = A000040(j), j&gt;=1, such that p(1)*p(2)*...*p(j) is an integral multiple of p(1)+p(2)+...+p(j).
 * @author Georg Fischer
 */
public class A140761 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A140761() {
    super(1, new A051838(), v -> Functions.PRIME.z(v));
  }
}
