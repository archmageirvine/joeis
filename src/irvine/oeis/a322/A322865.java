package irvine.oeis.a322;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.oeis.a122.A122111;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A322865 a(n) = A000265(A122111(n)).
 * @author Georg Fischer
 */
public class A322865 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A322865() {
    super(1, new A122111(), v -> v.makeOdd());
  }
}
