package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021844 Expansion of <code>1/((1-x)(1-4x)(1-6x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021844() {
    super(new long[] {-288, 432, -166, 23}, new long[] {1, 23, 363, 4963});
  }
}
