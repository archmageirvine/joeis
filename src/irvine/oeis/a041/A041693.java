package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041693 Denominators of continued fraction convergents to sqrt(366).
 * @author Sean A. Irvine
 */
public class A041693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041693() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1815850, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 8, 15, 23, 61, 755, 1571, 2326, 3897, 6223, 47458, 1809627, 12714847, 14524474, 27239321, 41763795, 110766911, 1370966727, 2852700365L, 4223667092L, 7076367457L, 11300034549L, 86176609300L});
  }
}
