package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081014.
 * @author Sean A. Irvine
 */
public class A081014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081014() {
    super(new long[] {1, -8, 8}, new long[] {2, 12, 77});
  }
}
