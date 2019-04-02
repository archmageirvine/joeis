package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116082 a(n) = C(n,7) + C(n,6) + C(n,5) + C(n,4) + C(n,3) + C(n,2) + C(n,1).
 * @author Sean A. Irvine
 */
public class A116082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116082() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 3, 7, 15, 31, 63, 127});
  }
}
