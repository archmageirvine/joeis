package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129973 <code>a(n) = A000045(n)-A000931(n)</code>.
 * @author Sean A. Irvine
 */
public class A129973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129973() {
    super(new long[] {-1, -2, 0, 2, 1}, new long[] {0, 0, 0, 1, 1});
  }
}
