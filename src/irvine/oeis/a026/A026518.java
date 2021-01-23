package irvine.oeis.a026;

import irvine.oeis.RunLengthSequence;

/**
 * A026518 a(n) = length of n-th run of identical symbols in A026517.
 * @author Sean A. Irvine
 */
public class A026518 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026518() {
    super(new A026517());
  }
}
