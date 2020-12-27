package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037281.
 * @author Sean A. Irvine
 */
public class A037281 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mN = Z.ZERO;

  private Z step(final Z n) {
    if (Z.ONE.equals(n) || n.isProbablePrime()) {
      return n;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (!Z.ONE.equals(d) && !n.equals(d)) {
        sb.append(d);
      }
    }
    return new Z(sb).makeOdd();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long c = 0;
    while (!Z.ONE.equals(m) && !m.isProbablePrime()) {
      m = step(m);
      ++c;
      if (mVerbose) {
        System.out.println(mN + " " + c + " " + m);
      }
    }
    return Z.valueOf(c);
  }
}

