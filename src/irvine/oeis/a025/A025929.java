package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025929 Expansion of <code>1/((1-2x)(1-3x)(1-4x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A025929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025929() {
    super(new long[] {-288, 336, -134, 21}, new long[] {1, 21, 307, 3969});
  }
}
