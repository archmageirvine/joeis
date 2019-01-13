package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253546.
 * @author Sean A. Irvine
 */
public class A253546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253546() {
    super(new long[] {1, -675, 675}, new long[] {1, 547, 368551});
  }
}
