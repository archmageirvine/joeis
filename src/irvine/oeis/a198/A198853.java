package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198853 5*8^n-1.
 * @author Sean A. Irvine
 */
public class A198853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198853() {
    super(new long[] {-8, 9}, new long[] {4, 39});
  }
}
