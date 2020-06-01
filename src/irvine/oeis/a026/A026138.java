package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026138 <code>a(n) = n-th</code> number k such that <code>s(j) &lt; s(k)</code> for all j <code>&lt;</code> k, where s <code>= A026136</code>.
 * @author Sean A. Irvine
 */
public class A026138 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026138() {
    super(new A026136(), 1);
  }
}
