package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a067.A067259;

/**
 * A071318 Lesser of 2 consecutive numbers which are cubefree and not squarefree, i.e., numbers k such that both k and k+1 are in A067259.
 * @author Sean A. Irvine
 */
public class A071318 extends A067259 {

  private Z mT = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT;
      mT = super.next();
      if (t.add(1).equals(mT)) {
        return t;
      }
    }
  }
}
