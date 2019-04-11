package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017229 <code>a(n) = (9*n + 5)^9</code>.
 * @author Sean A. Irvine
 */
public class A017229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017229() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1953125, 20661046784L, 1801152661463L, 35184372088832L, 327381934393961L, 1953125000000000L, 8662995818654939L, 31087100296429568L, 95151694449171437L, 257327417311663616L});
  }
}
