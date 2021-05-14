package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166446 Period 12: repeat [1,1,1,1,0,0,-1,-1,-1,-1,0,0].
 * @author Sean A. Irvine
 */
public class A166446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166446() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 1, 1, 1});
  }
}
