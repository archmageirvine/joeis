package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011920 <code>a(n) = b(n)*(b(n)+1) = b(n) + ... +</code> c(n), where <code>b(n) =</code> A011916(n), c(n) = A011918(n).
 * @author Sean A. Irvine
 */
public class A011920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011920() {
    super(new long[] {1, -209, 2926, -2926, 209}, new long[] {12, 1980, 378840, 73419192, 14241916260L});
  }
}
