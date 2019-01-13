package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063843.
 * @author Sean A. Irvine
 */
public class A063843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063843() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 34, 792, 10688, 90005, 533358, 2437848, 9156288, 29522961, 84293770});
  }
}
