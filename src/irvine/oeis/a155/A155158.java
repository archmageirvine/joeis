package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155158 Period 4: repeat [1, 5, 7, 3].
 * @author Sean A. Irvine
 */
public class A155158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155158() {
    super(new long[] {1, -1, 1}, new long[] {1, 5, 7});
  }
}
