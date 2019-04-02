package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041044 Numerators of continued fraction convergents to sqrt(28).
 * @author Sean A. Irvine
 */
public class A041044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041044() {
    super(new long[] {-1, 0, 0, 0, 254, 0, 0, 0}, new long[] {5, 16, 37, 127, 1307, 4048, 9403, 32257});
  }
}
