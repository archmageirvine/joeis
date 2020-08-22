package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026139 a(n) = s(k), where k is the n-th number such that s(j) &lt; s(k) for all j &lt; k, where s = A026136. Also a(n) = 2*t(n) - 1, where t = A026138.
 * @author Sean A. Irvine
 */
public class A026139 extends RecordSequence {

  /** Construct the sequence. */
  public A026139() {
    super(new A026136());
  }
}
