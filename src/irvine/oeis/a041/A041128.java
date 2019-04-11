package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041128 Numerators of continued fraction convergents to <code>sqrt(73)</code>.
 * @author Sean A. Irvine
 */
public class A041128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041128() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 2136, 0, 0, 0, 0, 0, 0}, new long[] {8, 9, 17, 94, 487, 581, 1068, 17669, 18737, 36406, 200767, 1040241, 1241008, 2281249});
  }
}
