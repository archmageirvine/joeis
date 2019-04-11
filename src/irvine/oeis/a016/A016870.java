package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016870 <code>(5n+1)^10</code>.
 * @author Sean A. Irvine
 */
public class A016870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016870() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 60466176, 25937424601L, 1099511627776L, 16679880978201L, 141167095653376L, 819628286980801L, 3656158440062976L, 13422659310152401L, 42420747482776576L, 119042423827613001L});
  }
}
