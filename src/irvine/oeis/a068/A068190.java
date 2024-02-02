package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068190 Largest number whose digit product equals n; a(n)=0 if no such number exists, e.g., when n has a prime factor larger than 7; no digit=1 is permitted to avoid an infinite number of solutions.
 * @author Sean A. Irvine
 */
public class A068190 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z[] p = fs.toZArray();
    if (p[p.length - 1].compareTo(Z.SEVEN) > 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    sb.append("7".repeat(fs.getExponent(Z.SEVEN)));
    sb.append("5".repeat(fs.getExponent(Z.FIVE)));
    sb.append("3".repeat(fs.getExponent(Z.THREE)));
    sb.append("2".repeat(fs.getExponent(Z.TWO)));
    return new Z(sb);
  }
}
