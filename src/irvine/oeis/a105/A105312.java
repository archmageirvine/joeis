package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105312 a(n) = Sum_{j=0..15} n^j.
 * @author Sean A. Irvine
 */
public class A105312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105312() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 16, 65535, 21523360, 1431655765, 38146972656L, 564221981491L, 5538821761600L, 40210710958665L, 231627523606480L, 1111111111111111L, 4594972986357216L, 16807659899548765L, 55451384098598320L, 167534872139182395L, 469172025408063616L});
  }
}
