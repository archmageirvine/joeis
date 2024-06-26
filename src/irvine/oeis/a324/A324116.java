package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-04-25/dirtraf at 2024-04-25 23:20

import irvine.oeis.a002.A002487;
import irvine.oeis.a323.A323247;
import irvine.oeis.transform.DirectTransformSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A324116 a(n) = A002487(1+A323247(n)) = A324288(A156552(n)).
 * @author Georg Fischer
 */
public class A324116 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A324116() {
    super(1, new A002487(), new SimpleTransformSequence(1, new A323247(), (n, v) -> v.add(1)));
  }
}
