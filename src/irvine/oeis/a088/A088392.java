package irvine.oeis.a088;
// Generated by gen_seq4.pl 2024-06-01/simtraf at 2024-06-01 22:47

import irvine.oeis.a069.A069522;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A088392 a(n)=A069522(n)/n.
 * @author Georg Fischer
 */
public class A088392 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A088392() {
    super(1, new A069522(), (n, v) -> v.divide(n));
  }
}
