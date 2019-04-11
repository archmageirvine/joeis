package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175833 Periodic sequence: repeat <code>4,7,11</code>.
 * @author Sean A. Irvine
 */
public class A175833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175833() {
    super(new long[] {1, 0, 0}, new long[] {4, 7, 11});
  }
}
