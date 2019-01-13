package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131229.
 * @author Sean A. Irvine
 */
public class A131229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131229() {
    super(new long[] {-1, 1, 1}, new long[] {1, 7, 11});
  }
}
