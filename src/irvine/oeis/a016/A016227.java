package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016227 Expansion of g.f. 1/((1-x)*(1-4*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016227() {
    super(new long[] {48, -64, 17}, new long[] {1, 17, 225});
  }
}
