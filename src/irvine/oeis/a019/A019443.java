package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019443 Expansion of <code>1/((1-4x)(1-6x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A019443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019443() {
    super(new long[] {216, -114, 19}, new long[] {1, 19, 247});
  }
}
