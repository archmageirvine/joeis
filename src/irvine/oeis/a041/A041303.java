package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041303 Denominators of continued fraction convergents to <code>sqrt(164)</code>.
 * @author Sean A. Irvine
 */
public class A041303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041303() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4098, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 31, 129, 160, 3969, 4129, 20485, 127039, 528641, 655680});
  }
}
