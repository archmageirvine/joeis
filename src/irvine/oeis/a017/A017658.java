package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017658 (12n+11)^6.
 * @author Sean A. Irvine
 */
public class A017658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017658() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1771561, 148035889, 1838265625, 10779215329L, 42180533641L, 128100283921L, 326940373369L});
  }
}
