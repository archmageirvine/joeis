package irvine.oeis.a322;
// Generated by gen_seq4.pl 2023-09-25/simtraf at 2023-09-28 18:36

import irvine.oeis.a048.A048675;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A322821 a(1) = 0; for n &gt; 1, a(n) = A000265(A048675(n)).
 * @author Georg Fischer
 */
public class A322821 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A322821() {
    super(1, new A048675(), v -> v.makeOdd());
  }
}
