package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016246 Expansion of <code>1/((1-x)(1-6x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016246() {
    super(new long[] {60, -76, 17}, new long[] {1, 17, 213});
  }
}
