package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131030 Period 6: repeat [16, 7, 7, 16, 25, 25].
 * @author Sean A. Irvine
 */
public class A131030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131030() {
    super(new long[] {1, -2, 2}, new long[] {16, 7, 7});
  }
}
