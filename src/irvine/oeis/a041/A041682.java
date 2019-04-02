package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041682 Numerators of continued fraction convergents to sqrt(360).
 * @author Sean A. Irvine
 */
public class A041682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041682() {
    super(new long[] {-1, 0, 38, 0}, new long[] {18, 19, 702, 721});
  }
}
