package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016170 Expansion of <code>1/((1-6x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A016170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016170() {
    super(new long[] {-48, 14}, new long[] {1, 14});
  }
}
