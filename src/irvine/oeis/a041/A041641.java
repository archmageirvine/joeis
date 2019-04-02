package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041641 Denominators of continued fraction convergents to sqrt(339).
 * @author Sean A. Irvine
 */
public class A041641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041641() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 195940, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 12, 17, 301, 318, 937, 2192, 5321, 193748, 392817, 979382, 2351581, 3330963, 58977952, 62308915, 183595782, 429500479, 1042596740});
  }
}
