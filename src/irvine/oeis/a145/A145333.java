package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145333 Numbers n such that there exists x in N : (x+43)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145333() {
    super(new long[] {-1, 33710}, new long[] {12943, 436295587});
  }
}
