package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028029 Expansion of <code>1/((1-3x)(1-4x)(1-5x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A028029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028029() {
    super(new long[] {-600, 530, -167, 22}, new long[] {1, 22, 317, 3830});
  }
}
