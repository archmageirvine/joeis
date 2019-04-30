package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252359 Numbers n such that the sum of the heptagonal numbers <code>H(n)</code> and <code>H(n+1)</code> is equal to the pentagonal number P(m) for some m.
 * @author Sean A. Irvine
 */
public class A252359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252359() {
    super(new long[] {1, -483, 483}, new long[] {158, 76252, 36753402});
  }
}
