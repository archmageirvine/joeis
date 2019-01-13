package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253878.
 * @author Sean A. Irvine
 */
public class A253878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253878() {
    super(new long[] {1, -17, 17}, new long[] {1, 22, 358});
  }
}
