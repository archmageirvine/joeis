package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065282 Inverse permutation to A065281.
 * @author Sean A. Irvine
 */
public class A065282 extends InverseSequence {

  /** Construct the sequence. */
  public A065282() {
    super(1, new A065281(), 1);
  }
}
