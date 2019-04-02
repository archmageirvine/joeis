package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110694 Kekul&#233; numbers for certain benzenoids.
 * @author Sean A. Irvine
 */
public class A110694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110694() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 19, 142, 664, 2330, 6726, 16848, 37884});
  }
}
