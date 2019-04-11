package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021079 Expansion of <code>1/((1-x)(1-2x)(1-4x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021079() {
    super(new long[] {-56, 106, -63, 14}, new long[] {1, 14, 133, 1086});
  }
}
