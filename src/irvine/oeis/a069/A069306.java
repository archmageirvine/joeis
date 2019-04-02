package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069306 Number of 2 X n binary arrays with a path of adjacent 1's from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069306() {
    super(new long[] {1, 2}, new long[] {5, 12});
  }
}
