package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157652 <code>a(n) = 40*(200*n - 49)</code>.
 * @author Sean A. Irvine
 */
public class A157652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157652() {
    super(new long[] {-1, 2}, new long[] {6040, 14040});
  }
}
