package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060883.
 * @author Sean A. Irvine
 */
public class A060883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060883() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 3, 73, 757, 4161, 15751, 46873});
  }
}
