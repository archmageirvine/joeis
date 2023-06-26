package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321008 a(1)=1; thereafter a(n) is obtained by applying Eric Angelini's remove-repeated-digits map, x-&gt;A320486(x), to n*a(n-1), stopping when 0 is reached.
 * @author Georg Fischer
 */
public class A321008 extends FiniteSequence {

  /** Construct the sequence. */
  public A321008() {
    super(1, FINITE, 1, 2, 6, 24, 120, 720, 54, 432, 3, 30, 0);
  }
}
