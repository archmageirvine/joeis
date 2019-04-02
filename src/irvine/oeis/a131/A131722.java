package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131722 Period 6: repeat [0, 10, 10, 10, 10, 10].
 * @author Sean A. Irvine
 */
public class A131722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131722() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 10, 10, 10, 10, 10});
  }
}
