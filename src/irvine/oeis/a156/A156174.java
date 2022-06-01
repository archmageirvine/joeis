package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156174 Period 5: repeat [1,-1,1,-1,0].
 * @author Sean A. Irvine
 */
public class A156174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156174() {
    super(new long[] {-1, -1, -1, -1}, new long[] {1, -1, 1, -1});
  }
}
