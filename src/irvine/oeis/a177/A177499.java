package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177499 Period 4: repeat [1, 16, 4, 16].
 * @author Sean A. Irvine
 */
public class A177499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177499() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 16, 4, 16});
  }
}
