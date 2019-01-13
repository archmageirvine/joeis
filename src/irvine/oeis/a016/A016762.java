package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016762.
 * @author Sean A. Irvine
 */
public class A016762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016762() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 59049, 9765625, 282475249, 3486784401L, 25937424601L, 137858491849L, 576650390625L, 2015993900449L, 6131066257801L, 16679880978201L});
  }
}
