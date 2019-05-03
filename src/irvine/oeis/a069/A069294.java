package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069294 Number of <code>n X 3</code> binary arrays with a path of adjacent <code>1</code>'s from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069294() {
    super(new long[] {16, 14, -34, 12}, new long[] {12, 110, 926, 7556});
  }
}
