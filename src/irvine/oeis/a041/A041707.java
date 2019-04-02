package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041707 Denominators of continued fraction convergents to sqrt(373).
 * @author Sean A. Irvine
 */
public class A041707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041707() {
    super(new long[] {1, 0, 0, 0, 0, 10236, 0, 0, 0, 0}, new long[] {1, 3, 16, 83, 265, 10153, 30724, 163773, 849589, 2712540});
  }
}
