package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158365 <code>529n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158365() {
    super(new long[] {-1, 2}, new long[] {528, 1057});
  }
}
