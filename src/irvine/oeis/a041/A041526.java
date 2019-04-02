package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041526 Numerators of continued fraction convergents to sqrt(280).
 * @author Sean A. Irvine
 */
public class A041526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041526() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 502, 0, 0, 0, 0, 0}, new long[] {16, 17, 50, 67, 184, 251, 8216, 8467, 25150, 33617, 92384, 126001});
  }
}
