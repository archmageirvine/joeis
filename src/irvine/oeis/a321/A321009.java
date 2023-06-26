package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321009 a(1)=2; thereafter a(n) is obtained by applying Eric Angelini's remove-repeated-digits map, x-&gt;A320486(x), to n*a(n-1), stopping when 0 is reached.
 * @author Georg Fischer
 */
public class A321009 extends FiniteSequence {

  /** Construct the sequence. */
  public A321009() {
    super(1, FINITE, 2, 4, 12, 48, 240, 10, 70, 560, 54, 540, 5940, 71280, 9240, 129360, 19, 304, 5168, 93024, 145, 29, 609, 198, 0);
  }
}
