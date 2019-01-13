package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122603.
 * @author Sean A. Irvine
 */
public class A122603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122603() {
    super(new long[] {-1, 876, -11826, 25954, -17903, 5146, -691, 43}, new long[] {1, 1, 2, 64, 1509, 27589, 453949, 7116398});
  }
}
