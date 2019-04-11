package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011906 If <code>b(n)</code> is A011900(n) and c(n) is A001109(n), then <code>a(n) =</code> b(n)*c(n) <code>= b(n) + (b(n)+1) + (b(n)+2) + ... +</code> c(n).
 * @author Sean A. Irvine
 */
public class A011906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011906() {
    super(new long[] {1, -41, 246, -246, 41}, new long[] {1, 18, 525, 17340, 586177});
  }
}
