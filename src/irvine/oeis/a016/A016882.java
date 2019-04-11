package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016882 <code>(5n+2)^10</code>.
 * @author Sean A. Irvine
 */
public class A016882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016882() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1024, 282475249, 61917364224L, 2015993900449L, 26559922791424L, 205891132094649L, 1125899906842624L, 4808584372417849L, 17080198121677824L, 52599132235830049L, 144555105949057024L});
  }
}
