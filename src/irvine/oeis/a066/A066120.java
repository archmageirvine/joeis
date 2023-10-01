package irvine.oeis.a066;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a006.A006939;

/**
 * A066120 Superduperprimorials: product of first n terms in Chernoff sequence.
 * @author Sean A. Irvine
 */
public class A066120 extends PartialProductSequence {

  /** Construct the sequence. */
  public A066120() {
    super(0, new A006939());
  }
}
