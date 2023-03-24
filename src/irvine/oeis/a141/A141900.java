package irvine.oeis.a141;

import irvine.math.z.Z;

/**
 * A062204.
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

