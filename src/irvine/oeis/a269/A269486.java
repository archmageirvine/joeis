package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269486 a(n) = Sum_{j=0..10} (-n)^j.
 * @author Sean A. Irvine
 */
public class A269486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269486() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 1, 683, 44287, 838861, 8138021, 51828151, 247165843, 954437177, 3138105961L, 9090909091L});
  }
}
