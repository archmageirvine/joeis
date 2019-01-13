package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253477.
 * @author Sean A. Irvine
 */
public class A253477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253477() {
    super(new long[] {1, -1, -110, 110, 1}, new long[] {1, 10, 46, 1045, 5005});
  }
}
