package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009955 Coordination sequence for <code>FeS2-Marcasite</code>, Fe position.
 * @author Sean A. Irvine
 */
public class A009955 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009955() {
    super(
      new long[] {1, 6, 13, 21, 9, -9, -21, -13, -6, -1},
      new int[] {2, 2, 2, 3});
  }
}
