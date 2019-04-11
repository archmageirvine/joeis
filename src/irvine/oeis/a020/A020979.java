package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020979 Expansion of <code>1/((1-8*x)*(1-10*x)*(1-11*x))</code>.
 * @author Sean A. Irvine
 */
public class A020979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020979() {
    super(new long[] {880, -278, 29}, new long[] {1, 29, 563});
  }
}
