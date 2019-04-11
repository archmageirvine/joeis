package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016886 <code>a(n) = (5n + 3)^2</code>.
 * @author Sean A. Irvine
 */
public class A016886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016886() {
    super(new long[] {1, -3, 3}, new long[] {9, 64, 169});
  }
}
