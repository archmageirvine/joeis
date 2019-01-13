package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229151.
 * @author Sean A. Irvine
 */
public class A229151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229151() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 9, 3584, 124659, 1572864, 11328125, 57106944, 224827239, 738197504, 2109289329});
  }
}
