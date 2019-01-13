package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080423.
 * @author Sean A. Irvine
 */
public class A080423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080423() {
    super(new long[] {-729, 1458, -1215, 540, -135, 18}, new long[] {1, 16, 153, 1134, 7182, 40824});
  }
}
