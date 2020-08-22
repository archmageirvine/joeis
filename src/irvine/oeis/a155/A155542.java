package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155542 Expansion of (2+2*x)/(1-8*x-25*x^2).
 * @author Sean A. Irvine
 */
public class A155542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155542() {
    super(new long[] {25, 8}, new long[] {2, 18});
  }
}
