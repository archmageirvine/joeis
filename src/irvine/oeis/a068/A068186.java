package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A068186 a(n) is the largest number whose product of decimal digits equals n^n.
 * @author Sean A. Irvine
 */
public class A068186 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(Z.valueOf(++mN).pow(mN));
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
