package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268152 A double binomial sum involving absolute values.
 * @author Sean A. Irvine
 */
public class A268152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268152() {
    super(new long[] {1048576, -327680, 40960, -2560, 80}, new long[] {0, 8, 8832, 1228800, 79364096});
  }
}
