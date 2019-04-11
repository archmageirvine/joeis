package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205086 <code>a(n) = n</code> 6's sandwiched between two 1's.
 * @author Sean A. Irvine
 */
public class A205086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205086() {
    super(new long[] {-10, 11}, new long[] {11, 161});
  }
}
