package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041445 Denominators of continued fraction convergents to <code>sqrt(238)</code>.
 * @author Sean A. Irvine
 */
public class A041445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041445() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 23326, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 7, 103, 110, 323, 756, 23003, 46762, 116527, 163289, 2402573, 2565862, 7534297, 17634456});
  }
}
