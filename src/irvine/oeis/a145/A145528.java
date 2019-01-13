package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145528.
 * @author Sean A. Irvine
 */
public class A145528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145528() {
    super(new long[] {1, -1455, 1455}, new long[] {455, 728182, 1058842239});
  }
}
