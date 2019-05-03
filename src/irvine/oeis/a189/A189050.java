package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189050 <code>a(n) =</code> if n even then <code>P((n-2)/2)+P(n/2)</code> otherwise <code>3*P((n+1)/2)+P((n-1)/2)</code> where <code>P(i)</code> are the Pell numbers <code>(A000129)</code>.
 * @author Sean A. Irvine
 */
public class A189050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189050() {
    super(new long[] {1, 0, 2, 0}, new long[] {3, 1, 7, 3});
  }
}
