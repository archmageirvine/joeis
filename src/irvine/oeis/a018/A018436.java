package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018436.
 * @author Sean A. Irvine
 */
public class A018436 extends FiniteSequence {

  /** Construct the sequence. */
  public A018436() {
    super(Cheetah.factor(405).divisorsSorted());
  }
}
