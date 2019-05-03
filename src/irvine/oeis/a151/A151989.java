package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151989 <code>a(n) = A001512(n)/24 = (5*n+1)*(5*n+2)*(5*n+3)*(5*n+4)/24</code>.
 * @author Sean A. Irvine
 */
public class A151989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151989() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 126, 1001, 3876, 10626});
  }
}
