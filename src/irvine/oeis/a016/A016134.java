package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016134 Expansion of <code>1/((1-2x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016134() {
    super(new long[] {-20, 12}, new long[] {1, 12});
  }
}
