package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143642 Numerators of principal and intermediate convergents to 3^(1/2).
 * @author Sean A. Irvine
 */
public class A143642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143642() {
    super(new long[] {-1, 0, 0, 4, 0, 0}, new long[] {1, 2, 3, 5, 7, 12});
  }
}
