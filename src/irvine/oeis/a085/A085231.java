package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085231 Numbers k in whose canonical factorization the power of the smallest prime factor is greater than the power of the greatest prime factor.
 * @author Sean A. Irvine
 */
public class A085231 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085231() {
    super(1, 12, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      final Z[] p = fs.toZArray();
      return p[0].pow(fs.getExponent(p[0])).compareTo(p[p.length - 1].pow(fs.getExponent(p[p.length - 1]))) > 0;
    });
  }
}
