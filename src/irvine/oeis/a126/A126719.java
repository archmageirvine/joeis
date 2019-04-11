package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126719 <code>a(n) = -n^2 + 9n + 23</code>.
 * @author Sean A. Irvine
 */
public class A126719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126719() {
    super(new long[] {1, -3, 3}, new long[] {23, 31, 37});
  }
}
