package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016130 Expansion of <code>1/((1-2x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A016130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016130() {
    super(new long[] {-14, 9}, new long[] {1, 9});
  }
}
