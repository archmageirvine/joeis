package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177499 Period <code>4</code>: repeat <code>[1, 16, 4, 16]</code>.
 * @author Sean A. Irvine
 */
public class A177499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177499() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 16, 4, 16});
  }
}
