package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078069.
 * @author Sean A. Irvine
 */
public class A078069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078069() {
    super(new long[] {-2, -2}, new long[] {1, -3});
  }
}
