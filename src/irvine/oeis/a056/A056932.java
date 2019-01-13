package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056932.
 * @author Sean A. Irvine
 */
public class A056932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056932() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 20, 168, 887, 3490, 11196, 30900, 75966, 170379});
  }
}
