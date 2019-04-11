package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041960 Numerators of continued fraction convergents to <code>sqrt(503)</code>.
 * @author Sean A. Irvine
 */
public class A041960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041960() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 49296, 0, 0, 0, 0, 0, 0, 0}, new long[] {22, 45, 112, 157, 3409, 3566, 10541, 24648, 1095053, 2214754, 5524561, 7739315, 168050176, 175789491, 519629158, 1215047807});
  }
}
