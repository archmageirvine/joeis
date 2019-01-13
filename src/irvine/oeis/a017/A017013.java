package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017013.
 * @author Sean A. Irvine
 */
public class A017013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017013() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 387420489, 68719476736L, 1801152661463L, 19683000000000L, 129961739795077L, 618121839509504L, 2334165173090451L, 7427658739644928L, 20711912837890625L});
  }
}
