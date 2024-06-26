package irvine.oeis.a088;
// Generated by gen_seq4.pl 2024-06-01/simtraf at 2024-06-01 22:47

import irvine.oeis.a069.A069526;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A088396 a(n)=A069526(n)/n.
 * @author Georg Fischer
 */
public class A088396 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A088396() {
    super(1, new A069526(), (n, v) -> v.divide(n));
  }
}
