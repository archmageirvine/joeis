package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016161 Expansion of g.f. 1/((1-5*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A016161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016161() {
    super(new long[] {-35, 12}, new long[] {1, 12});
  }
}
