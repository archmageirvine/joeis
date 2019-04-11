package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126980 <code>a(n) = 14*n + 47</code>.
 * @author Sean A. Irvine
 */
public class A126980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126980() {
    super(new long[] {-1, 2}, new long[] {47, 61});
  }
}
