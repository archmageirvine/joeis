package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164583 <code>a(n)=4^n*(2n + 1)^2</code>.
 * @author Sean A. Irvine
 */
public class A164583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164583() {
    super(new long[] {64, -48, 12}, new long[] {1, 36, 400});
  }
}
