package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065175 Inverse permutation to A065174.
 * @author Sean A. Irvine
 */
public class A065175 extends InverseSequence {

  /** Construct the sequence. */
  public A065175() {
    super(1, new A065174(), 1);
  }
}
