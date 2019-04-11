package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042137 Denominators of continued fraction convergents to <code>sqrt(593)</code>.
 * @author Sean A. Irvine
 */
public class A042137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042137() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1201264, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 17, 37, 91, 128, 219, 566, 1351, 7321, 8672, 24665, 1192592, 2409849, 3602441, 20422054, 44446549, 109315152, 153761701, 263076853, 679915407, 1622907667, 8794453742L, 10417361409L, 29629176560L});
  }
}
