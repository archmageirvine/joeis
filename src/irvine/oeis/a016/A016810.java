package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016810 a(n) = (4n)^10.
 * @author Sean A. Irvine
 */
public class A016810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016810() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1048576, 1073741824, 61917364224L, 1099511627776L, 10240000000000L, 63403380965376L, 296196766695424L, 1125899906842624L, 3656158440062976L, 10485760000000000L});
  }
}
