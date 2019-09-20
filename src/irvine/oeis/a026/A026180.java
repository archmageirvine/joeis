package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026180 <code>a(n) = s(k)</code>, where k is the n-th number such that <code>s(j)&lt;s(k)</code> for all j&lt;k, where s <code>= A026177</code>.
 * @author Sean A. Irvine
 */
public class A026180 extends RecordSequence {

  /** Construct the sequence. */
  public A026180() {
    super(new A026177());
  }
}
