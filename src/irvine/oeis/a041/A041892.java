package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041892 Numerators of continued fraction convergents to sqrt(468).
 * @author Sean A. Irvine
 */
public class A041892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041892() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1298, 0, 0, 0, 0, 0, 0, 0}, new long[] {21, 22, 43, 65, 173, 238, 411, 649, 27669, 28318, 55987, 84305, 224597, 308902, 533499, 842401});
  }
}
