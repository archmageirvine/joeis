package irvine.oeis.a229;
// Generated by gen_seq4.pl tricol

import irvine.math.z.Z;

/**
 * A229885 Number of 4 up, 4 down permutations of [n].
 * @author Georg Fischer
 */
public class A229885 extends A229892 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.compute(++mN, 4);
  }
}

