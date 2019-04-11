package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140976 Period length 10: repeat <code>8, 8, 6, 6, 4, 4, 2, 2, 0, 0 </code>.
 * @author Sean A. Irvine
 */
public class A140976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140976() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {8, 8, 6, 6, 4, 4, 2, 2, 0});
  }
}
