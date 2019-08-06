package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199561 <code>a(n) = 3*9^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199561() {
    super(new long[] {-9, 10}, new long[] {4, 28});
  }
}
