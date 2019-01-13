package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016750.
 * @author Sean A. Irvine
 */
public class A016750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016750() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1024, 1048576, 60466176, 1073741824, 10000000000L, 61917364224L, 289254654976L, 1099511627776L, 3570467226624L, 10240000000000L});
  }
}
