package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024437 Expansion of <code>1/((1-x)(1-7x)(1-8x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A024437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024437() {
    super(new long[] {-504, 695, -215, 25}, new long[] {1, 25, 410, 5570});
  }
}
