package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016146 Expansion of g.f. 1/((1-3*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016146() {
    super(new long[] {-33, 14}, new long[] {1, 14});
  }
}
