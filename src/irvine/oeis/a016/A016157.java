package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016157 Expansion of g.f. 1/((1-4*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016157() {
    super(new long[] {-40, 14}, new long[] {1, 14});
  }
}
