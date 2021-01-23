package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026169 a(n) = s(k), where k is the n-th number k such that s(j)&lt;s(k) for all j&lt;k, where s = A026166.
 * @author Sean A. Irvine
 */
public class A026169 extends RecordSequence {

  /** Construct the sequence. */
  public A026169() {
    super(new A026166());
  }
}
