package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016826 <code>a(n) = (4n + 2)^2</code>.
 * @author Sean A. Irvine
 */
public class A016826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016826() {
    super(new long[] {1, -3, 3}, new long[] {4, 36, 100});
  }
}
