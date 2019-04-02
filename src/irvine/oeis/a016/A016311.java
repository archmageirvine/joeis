package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016311 Expansion of 1/((1-2*x)*(1-7*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A016311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016311() {
    super(new long[] {112, -86, 17}, new long[] {1, 17, 203});
  }
}
