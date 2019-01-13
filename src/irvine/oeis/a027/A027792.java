package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027792.
 * @author Sean A. Irvine
 */
public class A027792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027792() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {35, 336, 1764, 6720, 20790, 55440, 132132, 288288, 585585});
  }
}
