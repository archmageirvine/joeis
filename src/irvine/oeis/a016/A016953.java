package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016953.
 * @author Sean A. Irvine
 */
public class A016953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016953() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 387420489, 38443359375L, 794280046581L, 7625597484987L, 46411484401953L, 208728361158759L, 756680642578125L, 2334165173090451L, 6351461955384057L});
  }
}
