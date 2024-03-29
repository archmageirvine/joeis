package irvine.oeis.a324;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;
import irvine.oeis.a306.A306800;

/**
 * A324809 a(n) is the number of endofunctions on a set of size n with preimage constraint {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}.
 * @author Georg Fischer
 */
public class A324809 extends A306800 {

  private int mN = -1;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 9);
  }
}

