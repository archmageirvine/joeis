package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020971 Expansion of <code>1/((1-7*x)*(1-9*x)*(1-11*x))</code>.
 * @author Sean A. Irvine
 */
public class A020971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020971() {
    super(new long[] {693, -239, 27}, new long[] {1, 27, 490});
  }
}
