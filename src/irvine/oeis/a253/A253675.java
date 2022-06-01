package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253675 Centered triangular numbers (A005448) which are also centered octagonal numbers (A016754).
 * @author Sean A. Irvine
 */
public class A253675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253675() {
    super(new long[] {1, -1, -9602, 9602, 1}, new long[] {1, 361, 6241, 3463321, 59923081});
  }
}
