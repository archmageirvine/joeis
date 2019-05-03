package irvine.oeis.a050;

import irvine.oeis.FiniteSequence;

/**
 * A050947 Values of Soviet money, <code>1961-1991 (in</code> kopecks; 100 kopecks <code>= 1 rouble)</code>.
 * @author Georg Fischer
 */
public class A050947 extends FiniteSequence {

  /** Construct the sequence. */
  public A050947() {
    super(1, 2, 3, 5, 10, 15, 20, 50, 100, 300, 500, 1000, 2500, 5000, 10000);
  }
}
