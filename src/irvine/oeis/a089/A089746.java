package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089746 Period <code>12</code>: repeat <code>(4, 4, 1, 2, 1, 1, 2, 2, 3, 3, 3, 3)</code>. (Number of syllables in English name of the <code>months.)</code>.
 * @author Sean A. Irvine
 */
public class A089746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089746() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {4, 4, 1, 2, 1, 1, 2, 2, 3, 3, 3, 3});
  }
}
