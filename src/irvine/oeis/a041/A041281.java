package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041281 Denominators of continued fraction convergents to sqrt(153).
 * @author Sean A. Irvine
 */
public class A041281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041281() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 4354, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 19, 46, 65, 176, 4289, 8754, 13043, 34840, 82723, 200286, 283009, 766304});
  }
}
