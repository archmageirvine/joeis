package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265423.
 * @author Sean A. Irvine
 */
public class A265423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265423() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 49, 151, 199, 201});
  }
}
