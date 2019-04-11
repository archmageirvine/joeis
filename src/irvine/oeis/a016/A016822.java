package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016822 <code>a(n) = (4n+1)^10</code>.
 * @author Sean A. Irvine
 */
public class A016822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016822() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 9765625, 3486784401L, 137858491849L, 2015993900449L, 16679880978201L, 95367431640625L, 420707233300201L, 1531578985264449L, 4808584372417849L, 13422659310152401L});
  }
}
