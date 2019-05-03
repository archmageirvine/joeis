package irvine.oeis.a014;

import irvine.oeis.RecordPositionSequence;

/**
 * A014407 <code>a(n) = n-th</code> number k such that <code>s(j) &lt; s(k)</code> for all j <code>&lt</code>; k, where s <code>= A014405</code>.
 * @author Sean A. Irvine
 */
public class A014407 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A014407() {
    super(new A014405(), 1);
  }
}
