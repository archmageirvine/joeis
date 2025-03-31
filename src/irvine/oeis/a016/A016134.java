package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016134 Expansion of g.f. 1/((1-2*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016134() {
    super(new long[] {-20, 12}, new long[] {1, 12});
  }
}
