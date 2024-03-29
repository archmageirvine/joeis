package irvine.oeis.a071;
// Generated by gen_seq4.pl 2023-10-19/simtraf at 2023-10-19 23:32

import irvine.oeis.a002.A002110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071555 Smallest x &gt; 1 such that x^prime(n) == 1 mod(prime(i)) 3&lt;=i&lt;=n.
 * @author Georg Fischer
 */
public class A071555 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071555() {
    super(3, new A002110().skip(3), v -> v.divide(6).add(1));
  }
}
