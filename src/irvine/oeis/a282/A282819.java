package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282819.
 * @author Sean A. Irvine
 */
public class A282819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282819() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 2, 22, 152, 680, 2270});
  }
}
