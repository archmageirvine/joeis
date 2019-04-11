package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016954 <code>a(n) = (6n+3)^10</code>.
 * @author Sean A. Irvine
 */
public class A016954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016954() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {59049, 3486784401L, 576650390625L, 16679880978201L, 205891132094649L, 1531578985264449L, 8140406085191601L, 34050628916015625L, 119042423827613001L, 362033331456891249L, 984930291881790849L});
  }
}
