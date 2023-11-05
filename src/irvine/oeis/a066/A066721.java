package irvine.oeis.a066;

import irvine.oeis.FilterSequence;

/**
 * A066721 Nonprimes in A066720.
 * @author Sean A. Irvine
 */
public class A066721 extends FilterSequence {

  /** Construct the sequence. */
  public A066721() {
    super(1, new A066720(), NONPRIME);
  }
}
