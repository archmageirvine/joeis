package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a080.A080843;

/**
 * A003146 Positions of letter c in the tribonacci word abacabaabacababac... generated by <code>a-&gt;ab, b-&gt;ac, c-&gt;a (cf. A092782)</code>.
 * @author Sean A. Irvine
 */
public class A003146 extends A080843 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }

}
