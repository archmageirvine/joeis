package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217775.
 * @author Sean A. Irvine
 */
public class A217775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217775() {
    super(new long[] {1, -3, 3}, new long[] {26, 44, 68});
  }
}
