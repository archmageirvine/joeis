package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116690 <code>a(n) =</code> C(n,8) + C(n,7) + C(n,6) + C(n,5) + C(n,4) + C(n,3) + C(n,2) + C(n,1).
 * @author Sean A. Irvine
 */
public class A116690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116690() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 3, 7, 15, 31, 63, 127, 255});
  }
}
