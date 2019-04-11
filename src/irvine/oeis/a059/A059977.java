package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059977 <code>a(n) =</code> binomial(n+2, <code>2)^4</code>.
 * @author Sean A. Irvine
 */
public class A059977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059977() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 81, 1296, 10000, 50625, 194481, 614656, 1679616, 4100625});
  }
}
