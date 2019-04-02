package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127961 A007583(n) written in binary.
 * @author Sean A. Irvine
 */
public class A127961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127961() {
    super(new long[] {-100, 101}, new long[] {1, 11});
  }
}
