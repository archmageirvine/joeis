package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221959 Expansion of <code>(2-17*x)/((1-4*x)*(1-6*x)*(1-8*x)*(1-10*x)*(1-16*x))</code>.
 * @author Sean A. Irvine
 */
public class A221959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221959() {
    super(new long[] {30720, -21632, 5776, -732, 44}, new long[] {2, 71, 1660, 32620, 586992});
  }
}
