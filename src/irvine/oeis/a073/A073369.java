package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073369 Let c(1)=n, e=2.71... and c(k+1)=floor(c(k)/e) if c(k) is even, c(k+1)=floor(e*c(k)) otherwise; sequence gives the smallest value a(n) such that c(a(n))=0.
 * @author Sean A. Irvine
 */
public class A073369 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z c = Z.valueOf(++mN);
    long k = 1;
    while (true) {
      ++k;
      c = c.isEven()
        ? CR.valueOf(c).divide(CR.E).floor()
        : CR.valueOf(c).multiply(CR.E).floor();
      if (c.isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

