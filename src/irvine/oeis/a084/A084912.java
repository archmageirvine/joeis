package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084912 <code>a(1) = 1024</code>; <code>a(n) = 5*a(n-1)/8</code>.
 * @author Georg Fischer
 */
public class A084912 extends FiniteSequence {

  /** Construct the sequence. */
  public A084912() {
    super(1024, 640, 400, 250);
  }
}
