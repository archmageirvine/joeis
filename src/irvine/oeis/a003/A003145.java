package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a080.A080843;

/**
 * A003145 Positions of letter b in the tribonacci word abacabaabacababac... generated by <code>a-&gt;ab,</code> b-&gt;ac, c-&gt;a (cf. A092782).
 * @author Sean A. Irvine
 */
public class A003145 extends A080843 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }

}
