package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081678 <code>a(n) = (4*6^n - 3*5^n - 3^n)/6</code>.
 * @author Sean A. Irvine
 */
public class A081678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081678() {
    super(new long[] {90, -63, 14}, new long[] {0, 1, 10});
  }
}
