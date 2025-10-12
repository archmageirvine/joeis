package irvine.oeis.a081;

import irvine.oeis.InverseSequence;

/**
 * A081146 Inverse permutation to A081145.
 * @author Sean A. Irvine
 */
public class A081146 extends InverseSequence {

  /** Construct the sequence. */
  public A081146() {
    super(1, new A081145());
  }
}
