package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026139 <code>a(n) = s(k)</code>, where k is the n-th number such that <code>s(j) &lt; s(k)</code> for all j &lt; k, where s <code>= A026136</code>. Also <code>a(n) = 2*t(n) - 1</code>, where t <code>= A026138</code>.
 * @author Sean A. Irvine
 */
public class A026139 extends RecordSequence {

  /** Construct the sequence. */
  public A026139() {
    super(new A026136());
  }
}
