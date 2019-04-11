package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020570 Expansion of <code>1/((1-6*x)*(1-7*x)*(1-8*x))</code>.
 * @author Sean A. Irvine
 */
public class A020570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020570() {
    super(new long[] {336, -146, 21}, new long[] {1, 21, 295});
  }
}
