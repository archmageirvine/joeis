package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253175.
 * @author Sean A. Irvine
 */
public class A253175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253175() {
    super(new long[] {1, -11, 11}, new long[] {1, 7, 67});
  }
}
