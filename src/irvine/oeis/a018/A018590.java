package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018590.
 * @author Sean A. Irvine
 */
public class A018590 extends FiniteSequence {

  /** Construct the sequence. */
  public A018590() {
    super(Cheetah.factor(682).divisorsSorted());
  }
}
