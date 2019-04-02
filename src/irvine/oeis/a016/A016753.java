package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016753 Expansion of 1/((1-3*x)*(1-4*x)*(1-5*x)).
 * @author Sean A. Irvine
 */
public class A016753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016753() {
    super(new long[] {60, -47, 12}, new long[] {1, 12, 97});
  }
}
