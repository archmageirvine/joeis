package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042326 Numerators of continued fraction convergents to sqrt(690).
 * @author Sean A. Irvine
 */
public class A042326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042326() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2942, 0, 0, 0, 0, 0}, new long[] {26, 79, 105, 289, 394, 1471, 76886, 232129, 309015, 850159, 1159174, 4327681});
  }
}
