package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175833 Periodic sequence: repeat 4,7,11.
 * @author Sean A. Irvine
 */
public class A175833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175833() {
    super(new long[] {1, 0, 0}, new long[] {4, 7, 11});
  }
}
