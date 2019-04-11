package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226097 <code>a(n) = ((-1)^n + 2*n - 38)*(2*n - 38) + 41</code>.
 * @author Sean A. Irvine
 */
public class A226097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226097() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1447, 1373, 1163, 1097, 911});
  }
}
