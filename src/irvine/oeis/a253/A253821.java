package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253821 Indices of octagonal numbers (A000567) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A253821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253821() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 181, 589, 208489, 679321});
  }
}
