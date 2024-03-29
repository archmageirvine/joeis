package irvine.oeis.a229;
// Generated by gen_seq4.pl tricol

import irvine.math.z.Z;

/**
 * A229890 Number of 9 up, 9 down permutations of [n].
 * @author Georg Fischer
 */
public class A229890 extends A229892 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.compute(++mN, 9);
  }
}

