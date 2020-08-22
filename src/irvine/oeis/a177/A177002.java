package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177002 Period 4: repeat [1, 2, 4, 2].
 * @author Sean A. Irvine
 */
public class A177002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177002() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 2, 4, 2});
  }
}
