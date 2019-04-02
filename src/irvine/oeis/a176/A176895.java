package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176895 Period 4: repeat [1, 4, 2, 4].
 * @author Sean A. Irvine
 */
public class A176895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176895() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 4, 2, 4});
  }
}
