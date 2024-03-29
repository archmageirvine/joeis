package irvine.oeis.a245;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A245406 Number of endofunctions on [n] such that no element has a preimage of cardinality two.
 * @author Georg Fischer
 */
public class A245406 extends A245405 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 2);
  }
}

