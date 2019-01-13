package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265722.
 * @author Sean A. Irvine
 */
public class A265722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265722() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 1, 4});
  }
}
