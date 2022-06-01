package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108791 a(2n) = -5*(fibonacci(6n+2))^2, a(2n+1) = (lucas(6n+5))^2.
 * @author Sean A. Irvine
 */
public class A108791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108791() {
    super(new long[] {-1, -19, -19}, new long[] {-5, 121, -2205});
  }
}
