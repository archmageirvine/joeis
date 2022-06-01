package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016918 a(n) = (6*n)^10.
 * @author Sean A. Irvine
 */
public class A016918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016918() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 60466176, 61917364224L, 3570467226624L, 63403380965376L, 590490000000000L, 3656158440062976L, 17080198121677824L, 64925062108545024L, 210832519264920576L, 604661760000000000L});
  }
}
