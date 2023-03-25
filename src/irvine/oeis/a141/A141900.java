package irvine.oeis.a141;

import irvine.math.z.Z;

/**
 * A141900 a(n) = smallest term in A141586 that is divisible by 2^n but not by 2^(n+1).
 * @author Sean A. Irvine
 */
public class A141900 extends A141586 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z t = super.next();
      t.makeOdd();
      if (t.auxiliary() == mN) {
        return t;
      }
    }
  }
}

