package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041326 Numerators of continued fraction convergents to <code>sqrt(177)</code>.
 * @author Sean A. Irvine
 */
public class A041326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041326() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 124846, 0, 0, 0, 0, 0, 0, 0}, new long[] {13, 40, 133, 306, 2581, 5468, 18985, 62423, 1641983, 4988372, 16607099, 38202570, 322227659, 682657888, 2370201323L, 7793261857L});
  }
}
