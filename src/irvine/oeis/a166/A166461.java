package irvine.oeis.a166;

import irvine.oeis.FiniteSequence;

/**
 * A166461 a(n) is the smallest integer &gt; a(n-1) such that a(n) shares no digit with a(n-1) and c=a(n-1)+a(n), and also a(n-1) shares no digit with c.
 * @author Georg Fischer
 */
public class A166461 extends FiniteSequence {

  /** Construct the sequence. */
  public A166461() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 42, 51, 249, 306, 419, 2587, 3413, 5255, 6064, 7255, 8844, 11156, 22222, 31778, 60444, 72755, 88344, 111656, 222088, 333361, 422224, 508887, 622224, 708887, 922224, 5138383);
  }
}
