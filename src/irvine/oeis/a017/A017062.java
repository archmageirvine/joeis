package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017062 <code>a(n) = (7*n + 6)^10</code>.
 * @author Sean A. Irvine
 */
public class A017062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017062() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {60466176, 137858491849L, 10240000000000L, 205891132094649L, 2064377754059776L, 13422659310152401L, 64925062108545024L, 253295162119140625L, 839299365868340224L, 2446194060654759801L, 6428888932339941376L});
  }
}
