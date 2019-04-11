package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140675 <code>a(n) = n*(3*n + 19)/2</code>.
 * @author Sean A. Irvine
 */
public class A140675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140675() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 25});
  }
}
