package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112415 <code>a(n) =</code> C(1+n,1) * C(2+n,1) * C(4+n,2).
 * @author Sean A. Irvine
 */
public class A112415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112415() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, 60, 180, 420, 840});
  }
}
