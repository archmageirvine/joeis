package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016256 Expansion of <code>1/((1-x)*(1-8*x)*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A016256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016256() {
    super(new long[] {72, -89, 18}, new long[] {1, 18, 235});
  }
}
