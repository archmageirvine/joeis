package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155049 Expansion of <code>(1+5*x)/(1-13*x+10*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A155049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155049() {
    super(new long[] {-10, 13}, new long[] {1, 18});
  }
}
