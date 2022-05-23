package irvine.oeis.a064;

import irvine.oeis.InverseSequence;
import irvine.oeis.a054.A054082;

/**
 * A064579 Inverse permutation to A054082.
 * @author Sean A. Irvine
 */
public class A064579 extends InverseSequence {

  /** Construct the sequence. */
  public A064579() {
    super(new A054082());
  }
}
