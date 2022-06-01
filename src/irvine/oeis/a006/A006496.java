package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006496 Imaginary part of (1+2i)^n.
 * @author Sean A. Irvine
 */
public class A006496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006496() {
    super(new long[] {-5, 2}, new long[] {0, 2});
  }
}

