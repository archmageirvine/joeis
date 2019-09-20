package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026175 <code>a(n) = s(k)</code>, where k is the n-th number satisfying <code>s(j)&lt;s(k)</code> for all j&lt;k, where s <code>= A026172</code>.
 * @author Sean A. Irvine
 */
public class A026175 extends RecordSequence {

  /** Construct the sequence. */
  public A026175() {
    super(new A026172());
  }
}
