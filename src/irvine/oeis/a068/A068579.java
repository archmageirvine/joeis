package irvine.oeis.a068;

import irvine.oeis.FiniteSequence;

/**
 * A068579 Let <code>phi_m(x)=phi(phi(....(phi(x))...)</code> m times; sequence gives values of n such that <code>phi_3(n)=tau(n)</code>.
 * @author Georg Fischer
 */
public class A068579 extends FiniteSequence {

  /** Construct the sequence. */
  public A068579() {
    super(1, 11, 13, 19, 33, 34, 35, 39, 46, 57, 58, 62, 74, 86, 88, 102, 104, 105, 110, 130, 135, 138, 152, 154, 174, 182, 186, 190, 222, 258, 264, 280, 312, 330, 342, 390, 456, 462, 546, 570, 594, 756, 840, 1080);
  }
}
