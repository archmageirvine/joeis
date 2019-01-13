package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006356.
 * @author Sean A. Irvine
 */
public class A006356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006356() {
    super(new long[] {-1, 1, 2}, new long[] {1, 3, 6});
  }
}

