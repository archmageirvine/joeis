package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a067.A067259;

/**
 * A071320 Least of four consecutive numbers which are cubefree and not squarefree, i.e., numbers k such that {k, k+1, k+2, k+3} are in A067259.
 * @author Sean A. Irvine
 */
public class A071320 extends A067259 {

  private Z mT = super.next();
  private Z mU = super.next();
  private Z mV = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT;
      mT = mU;
      mU = mV;
      mV = super.next();
      if (t.add(3).equals(mV)) {
        return t;
      }
    }
  }
}
