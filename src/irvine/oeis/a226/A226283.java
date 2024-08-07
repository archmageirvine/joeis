package irvine.oeis.a226;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A226283 a(n) = [n/2]!*[(n+1)/2]!*C([n/2],2)*C([(n+1)/2],2).
 * @author Georg Fischer
 */
public class A226283 extends A226288 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 3);
  }
}

