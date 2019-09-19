package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026169 <code>a(n) = s(k)</code>, where k is the n-th number k such that <code>s(j)&lt;s(k)</code> for all j&lt;k, where s <code>= A026166</code>.
 * @author Sean A. Irvine
 */
public class A026169 extends RecordSequence {

  /** Construct the sequence. */
  public A026169() {
    super(new A026166());
  }
}
