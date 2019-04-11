package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017025 <code>a(n) = (7*n + 3)^9</code>.
 * @author Sean A. Irvine
 */
public class A017025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017025() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 1000000000, 118587876497L, 2641807540224L, 26439622160671L, 165216101262848L, 756680642578125L, 2779905883635712L, 8662995818654939L, 23762680013799936L});
  }
}
