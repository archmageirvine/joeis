package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152041 <code>A008893/2</code>.
 * @author Sean A. Irvine
 */
public class A152041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152041() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 33, 129, 355});
  }
}
