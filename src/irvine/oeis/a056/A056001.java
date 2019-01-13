package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056001.
 * @author Sean A. Irvine
 */
public class A056001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056001() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 16, 108, 480, 1650, 4752, 12012, 27456, 57915});
  }
}
