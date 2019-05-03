package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145063 Hankel transform of <code>A145062</code>.
 * @author Sean A. Irvine
 */
public class A145063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145063() {
    super(new long[] {-1, 0, -3, 0, -3, 0}, new long[] {1, -1, -3, 1, 6, -1});
  }
}
