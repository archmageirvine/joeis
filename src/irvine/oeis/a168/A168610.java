package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168610 <code>a(n) = 3^n + 5</code>.
 * @author Sean A. Irvine
 */
public class A168610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168610() {
    super(new long[] {-3, 4}, new long[] {6, 8});
  }
}
