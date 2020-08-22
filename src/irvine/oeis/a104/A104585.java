package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104585 (1/2) * ( 3*n^2 - n*(-1)^n ).
 * @author Sean A. Irvine
 */
public class A104585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104585() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 15, 22});
  }
}
