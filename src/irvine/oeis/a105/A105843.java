package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105843 Numbers n such that <code>n^2 = 37*m^2 + 37*m +1</code>.
 * @author Sean A. Irvine
 */
public class A105843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105843() {
    super(new long[] {-1, 0, 146, 0}, new long[] {1, 149, 295, 21755});
  }
}
