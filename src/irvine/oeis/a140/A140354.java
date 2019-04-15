package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140354 <code>a(n) = binomial(n+9,9)*2^n</code>.
 * @author Sean A. Irvine
 */
public class A140354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140354() {
    super(new long[] {-1024, 5120, -11520, 15360, -13440, 8064, -3360, 960, -180, 20}, new long[] {1, 20, 220, 1760, 11440, 64064, 320320, 1464320, 6223360, 24893440});
  }
}
