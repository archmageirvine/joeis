package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110690 Kekul\u00e9 numbers for certain benzenoids.
 * @author Sean A. Irvine
 */
public class A110690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110690() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 22, 193, 1045, 4180, 13566, 37764, 93456, 210705});
  }
}
