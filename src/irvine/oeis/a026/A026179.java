package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026179 <code>a(n) = n-th</code> number k such that <code>s(j)&lt;s(k)</code> for all j&lt;k, where s <code>= A026177</code>.
 * @author Sean A. Irvine
 */
public class A026179 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026179() {
    super(new A026177(), 1);
  }
}
