package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049294 Number of subgroups of index 3 in free group of rank <code>n+1</code>.
 * @author Sean A. Irvine
 */
public class A049294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049294() {
    super(new long[] {12, -20, 9}, new long[] {1, 13, 97});
  }
}
