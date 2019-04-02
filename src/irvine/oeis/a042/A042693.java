package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042693 Denominators of continued fraction convergents to sqrt(876).
 * @author Sean A. Irvine
 */
public class A042693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042693() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 21902, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 72, 149, 221, 370, 21681, 22051, 43732, 109515, 1576942, 3263399, 4840341, 8103740});
  }
}
