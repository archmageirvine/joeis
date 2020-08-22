package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016304 Expansion of 1/((1-2*x)*(1-6*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A016304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016304() {
    super(new long[] {84, -68, 15}, new long[] {1, 15, 157});
  }
}
