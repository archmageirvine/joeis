package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028037 Expansion of <code>1/((1-3x)(1-4x)(1-6x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028037() {
    super(new long[] {-864, 720, -210, 25}, new long[] {1, 25, 415, 5845});
  }
}
