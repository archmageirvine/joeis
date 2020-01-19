package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010344 <code>Base-4</code> Armstrong or narcissistic numbers (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A010344 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010344() {
    super(1, 2, 3, 28, 29, 35, 43, 55, 62, 83, 243);
  }
}
