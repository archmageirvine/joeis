package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204769 a(n) = 151*(n-1) - a(n-1) with n&gt;1, a(1)=46.
 * @author Sean A. Irvine
 */
public class A204769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204769() {
    super(new long[] {-1, 1, 1}, new long[] {46, 105, 197});
  }
}
