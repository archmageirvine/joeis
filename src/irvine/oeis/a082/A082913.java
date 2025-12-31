package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082913 Least k such that H(k) &gt; 2^n, where H(k) is the harmonic number Sum_{i=1..k} 1/i.
 * @author Sean A. Irvine
 */
public class A082913 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.ONE.shiftLeft(++mN)).subtract(CR.GAMMA).exp().subtract(CR.HALF).floor().add(1);
  }
}
