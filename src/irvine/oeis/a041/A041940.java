package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041940 Numerators of continued fraction convergents to sqrt(493).
 * @author Sean A. Irvine
 */
public class A041940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041940() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1367964, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {22, 89, 111, 1199, 3708, 12323, 126938, 139261, 683982, 30234469, 121621858, 151856327, 1640185128, 5072411711L, 16857420261L, 173646614321L, 190504034582L, 935662752649L});
  }
}
