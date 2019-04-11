package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176965 <code>a(n) = 2^(n-1) - (2^n*(-1)^n + 2)/3</code>.
 * @author Sean A. Irvine
 */
public class A176965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176965() {
    super(new long[] {-4, 4, 1}, new long[] {1, 0, 6});
  }
}
