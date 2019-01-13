package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246987.
 * @author Sean A. Irvine
 */
public class A246987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246987() {
    super(new long[] {240, -508, 372, -121, 18}, new long[] {1, 7, 39, 206, 1087});
  }
}
