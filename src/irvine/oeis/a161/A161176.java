package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161176 <code>4n^2-10n+107</code>.
 * @author Sean A. Irvine
 */
public class A161176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161176() {
    super(new long[] {1, -3, 3}, new long[] {107, 101, 103});
  }
}
