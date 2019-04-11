package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057932 <code>a(n) = floor(10^(n+1)/81)</code>.
 * @author Sean A. Irvine
 */
public class A057932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057932() {
    super(new long[] {-10, 1, 0, 0, 0, 0, 0, 0, 0, 10}, new long[] {0, 1, 12, 123, 1234, 12345, 123456, 1234567, 12345679, 123456790});
  }
}
