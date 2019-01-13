package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020517.
 * @author Sean A. Irvine
 */
public class A020517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020517() {
    super(new long[] {512, -584, 73}, new long[] {3, 73, 4161});
  }
}
