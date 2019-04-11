package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158225 <code>196n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158225() {
    super(new long[] {-1, 2}, new long[] {195, 391});
  }
}
