package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016307 Expansion of 1/((1-2*x)*(1-6*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016307() {
    super(new long[] {120, -92, 18}, new long[] {1, 18, 232});
  }
}
