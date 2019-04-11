package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157954 <code>162n - 1</code>.
 * @author Sean A. Irvine
 */
public class A157954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157954() {
    super(new long[] {-1, 2}, new long[] {161, 323});
  }
}
