package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026144 <code>a(n) = n-th</code> number k such that <code>s(j) &lt; s(k)</code> for all j <code>&lt</code>; k, where s <code>= A026142</code>.
 * @author Sean A. Irvine
 */
public class A026144 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026144() {
    super(new A026142(), 1);
  }
}
