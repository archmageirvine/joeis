package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253411 Indices of centered octagonal numbers (A016754) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A253411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253411() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 76, 646, 108871, 930811});
  }
}
