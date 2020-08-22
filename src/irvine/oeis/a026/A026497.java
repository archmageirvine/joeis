package irvine.oeis.a026;

import irvine.oeis.RunLengthSequence;

/**
 * A026497 a(n) = length of n-th run of identical symbols in A026492.
 * @author Sean A. Irvine
 */
public class A026497 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026497() {
    super(new A026492());
  }
}
