package irvine.oeis.a064;

import irvine.oeis.InverseSequence;
import irvine.oeis.a035.A035506;

/**
 * A064357 Inverse of sequence A035506 considered as a permutation of the natural numbers.
 * @author Sean A. Irvine
 */
public class A064357 extends InverseSequence {

  /** Construct the sequence. */
  public A064357() {
    super(new A035506(), 1, 1);
  }
}
