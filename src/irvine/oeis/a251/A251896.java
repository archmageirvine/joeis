package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251896 Numbers n such that the octagonal number <code>N(n)</code> is equal to the sum of the octagonal numbers N(m) and N(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A251896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251896() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 43, 521, 49235, 600849});
  }
}
