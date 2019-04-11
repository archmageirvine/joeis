package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236333 The (n-2)-th <code>(n&gt;=3)</code> triple of terms gives coefficients of double trinomial P_n(x) <code>= ((n-2)^2*x^2 + n*x + 2)/2</code> (see comment).
 * @author Sean A. Irvine
 */
public class A236333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236333() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 3, 2, 4, 4, 2, 9, 5, 2});
  }
}
