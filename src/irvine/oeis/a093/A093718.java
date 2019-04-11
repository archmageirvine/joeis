package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093718 <code>a(n) = (n mod 3)^(n mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A093718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093718() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 1, 1, 0, 1});
  }
}
