package irvine.oeis.a026;

import irvine.oeis.base.RunLengthSequence;

/**
 * A026499 a(n) = length of n-th run of identical symbols in A026498.
 * @author Sean A. Irvine
 */
public class A026499 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026499() {
    super(1, new A026498());
  }
}
