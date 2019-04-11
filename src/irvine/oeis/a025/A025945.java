package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025945 Expansion of <code>1/((1-2x)(1-3x)(1-7x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A025945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025945() {
    super(new long[] {-420, 452, -161, 22}, new long[] {1, 22, 323, 4016});
  }
}
