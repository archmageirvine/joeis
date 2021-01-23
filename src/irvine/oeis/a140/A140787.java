package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140787 Expansion of 1 / ( (1+x)*(2*x+1)*(-1+2*x)^2 ).
 * @author Sean A. Irvine
 */
public class A140787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140787() {
    super(new long[] {-8, -4, 6, 1}, new long[] {1, 1, 7, 9});
  }
}
