package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041852 Numerators of continued fraction convergents to sqrt(448).
 * @author Sean A. Irvine
 */
public class A041852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041852() {
    super(new long[] {-1, 0, 254, 0}, new long[] {21, 127, 5355, 32257});
  }
}
