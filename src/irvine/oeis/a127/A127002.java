package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127002 Number of partitions of n that have the form <code>a+a+b+c</code> where a,b,c are distinct.
 * @author Sean A. Irvine
 */
public class A127002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127002() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {0, 0, 0, 0, 0, 0, 1, 2, 4});
  }
}
