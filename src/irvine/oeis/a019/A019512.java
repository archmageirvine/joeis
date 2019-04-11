package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019512 Expansion of <code>1/((1-4x)(1-7x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A019512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019512() {
    super(new long[] {224, -116, 19}, new long[] {1, 19, 245});
  }
}
