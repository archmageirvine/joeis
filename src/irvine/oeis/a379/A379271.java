package irvine.oeis.a379;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A379271 Composite numbers, k, whose prime factors, viewed on a log log scale, have a small standard deviation defined with respect to bigomega(k), as specified in the comments.
 * @author Sean A. Irvine
 */
public class A379271 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      final CR stdDevBigOmega = CR.valueOf(Z.valueOf(fs.bigOmega()).square().subtract(1)).divide(12);
      CR sx = CR.ZERO;
      CR sx2 = CR.ZERO;
      long cnt = 0;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        cnt += e;
        final CR ll = CR.valueOf(p).log().log();
        sx = sx.add(ll.multiply(e));
        sx2 = sx2.add(ll.square().multiply(e));
      }
      final CR stdDevP = sx2.divide(cnt).subtract(sx.divide(cnt).square());
      if (stdDevP.compareTo(stdDevBigOmega) < 0) {
        return n;
      }
    }
  }
}

