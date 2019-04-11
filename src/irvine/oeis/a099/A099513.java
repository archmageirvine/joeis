package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099513 Row sums of triangle A099512, so that <code>a(n) =</code> Sum_{k=0..n} coefficient of z^k in <code>(1 +</code> 3*z + z^2)^(n-[k/2]), where <code>[k/2]</code> is the integer floor of <code>k/2</code>.
 * @author Sean A. Irvine
 */
public class A099513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099513() {
    super(new long[] {-1, 7, 1, 2}, new long[] {1, 4, 8, 27});
  }
}
