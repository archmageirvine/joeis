package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231306 Recurrence <code>a(n) = a(n-2) + n^M</code> for <code>M=7</code>, starting with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A231306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231306() {
    super(new long[] {1, -8, 27, -48, 42, 0, -42, 48, -27, 8}, new long[] {0, 1, 128, 2188, 16512, 80313, 296448, 903856, 2393600, 5686825});
  }
}
