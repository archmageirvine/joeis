package irvine.oeis.a246;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A246528 Number of endofunctions on [n] whose cycle lengths are divisors of 8.
 * @author Georg Fischer
 */
public class A246528 extends A246522 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 8);
  }
}

