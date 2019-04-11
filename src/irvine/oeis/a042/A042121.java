package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042121 Denominators of continued fraction convergents to <code>sqrt(585)</code>.
 * @author Sean A. Irvine
 */
public class A042121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042121() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 66562, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 11, 16, 75, 91, 257, 1376, 66305, 332901, 732107, 1065008, 4992139, 6057147, 17106433, 91589312});
  }
}
