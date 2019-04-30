package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087509 <code>a(n) = #{k=0..n, mod(kn,3) = 2}</code>.
 * @author Sean A. Irvine
 */
public class A087509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087509() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 0, 1, 0, 1, 2});
  }
}
