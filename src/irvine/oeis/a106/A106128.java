package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-03-14/filtpos at 2024-03-19 14:00

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001358;

/**
 * A106128 Numbers k such that the k-th semiprime == 3 (mod k).
 * @author Georg Fischer
 */
public class A106128 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A106128() {
    super(1, 1, new A001358(), (k, v) -> v.mod(k) == 3 % k);
  }
}
