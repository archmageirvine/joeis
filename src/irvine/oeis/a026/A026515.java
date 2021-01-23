package irvine.oeis.a026;

import irvine.oeis.RunLengthSequence;

/**
 * A026515 a(n) = length of n-th run of identical symbols in A026513.
 * @author Sean A. Irvine
 */
public class A026515 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026515() {
    super(new A026513());
  }
}
