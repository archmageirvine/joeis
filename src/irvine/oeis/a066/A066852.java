package irvine.oeis.a066;

import irvine.oeis.FilterSequence;

/**
 * A066852 Odd values arising in A066820.
 * @author Sean A. Irvine
 */
public class A066852 extends FilterSequence {

  /** Construct the sequence. */
  public A066852() {
    super(1, new A066820(), ODD);
  }
}
