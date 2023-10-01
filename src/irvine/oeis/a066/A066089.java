package irvine.oeis.a066;

import irvine.oeis.InverseSequence;

/**
 * A066089 Smallest m such that A066088(m) = A001221(A001157(m)) = n.
 * @author Sean A. Irvine
 */
public class A066089 extends InverseSequence {

  /** Construct the sequence. */
  public A066089() {
    super(1, new A066088());
  }
}
