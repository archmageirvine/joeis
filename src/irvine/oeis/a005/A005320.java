package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005320 <code>a(n) = 4*a(n-1) - a(n-2)</code>, with <code>a(0) = 0, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A005320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005320() {
    super(new long[] {-1, 4}, new long[] {0, 3});
  }
}
