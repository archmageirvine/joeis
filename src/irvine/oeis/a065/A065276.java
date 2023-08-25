package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065276 The inverse permutation to A065275.
 * @author Sean A. Irvine
 */
public class A065276 extends InverseSequence {

  /** Construct the sequence. */
  public A065276() {
    super(1, new A065275(), 1);
  }
}
