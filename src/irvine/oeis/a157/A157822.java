package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157822 <code>1482401250n^2+108900n+1</code>.
 * @author Sean A. Irvine
 */
public class A157822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157822() {
    super(new long[] {1, -3, 3}, new long[] {1482510151, 5929822801L, 13341937951L});
  }
}
