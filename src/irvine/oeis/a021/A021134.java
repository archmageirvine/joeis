package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021134 Expansion of <code>1/((1-x)(1-2x)(1-5x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021134() {
    super(new long[] {-90, 163, -89, 17}, new long[] {1, 17, 200, 2050});
  }
}
