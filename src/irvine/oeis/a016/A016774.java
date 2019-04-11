package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016774 <code>a(n) = (3*n)^10</code>.
 * @author Sean A. Irvine
 */
public class A016774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016774() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 59049, 60466176, 3486784401L, 61917364224L, 576650390625L, 3570467226624L, 16679880978201L, 63403380965376L, 205891132094649L, 590490000000000L});
  }
}
