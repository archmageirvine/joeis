package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321008 <code>a(1)=1</code>; thereafter <code>a(n)</code> is obtained by applying Eric Agelini's remove-repeated-digits map, x-&gt;A320486(x), to <code>n*a(n-1),</code> stopping when 0 is reached.
 * @author Georg Fischer
 */
public class A321008 extends FiniteSequence {

  /** Construct the sequence. */
  public A321008() {
    super(1, 2, 6, 24, 120, 720, 54, 432, 3, 30, 0);
  }
}
