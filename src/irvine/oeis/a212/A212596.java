package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212596 Number of cards required to build a Menger sponge of level n in origami.
 * @author Sean A. Irvine
 */
public class A212596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212596() {
    super(new long[] {-160, 28}, new long[] {12, 192});
  }
}
