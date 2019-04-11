package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158308 <code>361n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158308() {
    super(new long[] {-1, 2}, new long[] {360, 721});
  }
}
