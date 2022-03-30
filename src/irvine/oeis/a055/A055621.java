package irvine.oeis.a055;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000612;

/**
 * A055621 Number of covers of an unlabeled n-set.
 * @author Sean A. Irvine
 */
public class A055621 extends DifferenceSequence {

  /** Construct the sequence. */
  public A055621() {
    super(new PrependSequence(new A000612(), 0));
  }
}
