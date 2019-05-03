package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104122 Numbers that are written <code>(in French)</code> with only one of the letters a,e,i,o,u,y.
 * @author Georg Fischer
 */
public class A104122 extends FiniteSequence {

  /** Construct the sequence. */
  public A104122() {
    super(1, 5, 6, 7, 10, 20, 100);
  }
}
