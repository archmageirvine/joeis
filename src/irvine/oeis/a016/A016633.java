package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016633 Expansion of g.f. 1/((1-2*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016633() {
    super(new long[] {264, -178, 25}, new long[] {1, 25, 447});
  }
}
