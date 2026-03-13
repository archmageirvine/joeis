package irvine.oeis.a084;

import irvine.oeis.FilterSequence;

/**
 * A084112 Nonprimes in A084111.
 * @author Sean A. Irvine
 */
public class A084112 extends FilterSequence {

  /** Construct the sequence. */
  public A084112() {
    super(1, new A084111(), NONPRIME);
  }
}
