package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145332 Numbers Y such that 129*Y^2+43 is a square.
 * @author Sean A. Irvine
 */
public class A145332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145332() {
    super(new long[] {-1, 33710}, new long[] {53, 1786683});
  }
}
