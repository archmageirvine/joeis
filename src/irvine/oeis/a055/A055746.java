package irvine.oeis.a055;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a003.A003046;

/**
 * A055746 Product of first n terms of A003046.
 * @author Sean A. Irvine
 */
public class A055746 extends PartialProductSequence {

  /** Construct the sequence. */
  public A055746() {
    super(new A003046());
  }
}
