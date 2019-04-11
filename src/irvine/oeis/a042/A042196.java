package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042196 Numerators of continued fraction convergents to <code>sqrt(623)</code>.
 * @author Sean A. Irvine
 */
public class A042196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042196() {
    super(new long[] {-1, 0, 0, 0, 1248, 0, 0, 0}, new long[] {24, 25, 599, 624, 30551, 31175, 747576, 778751});
  }
}
