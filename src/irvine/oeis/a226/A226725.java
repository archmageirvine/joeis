package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226725 Denominator of the median of <code>{1, 1/2, 1/3, </code>..., <code>1/n}</code>.
 * @author Sean A. Irvine
 */
public class A226725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226725() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 4, 2, 12, 3, 24});
  }
}
