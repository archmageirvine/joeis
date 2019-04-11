package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021174 Expansion of <code>1/((1-x)(1-2x)(1-6x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021174() {
    super(new long[] {-84, 152, -83, 16}, new long[] {1, 16, 173, 1592});
  }
}
