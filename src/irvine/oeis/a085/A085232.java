package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085232 In canonical prime factorization: power of smallest prime factor is less than power of greatest prime factor.
 * @author Sean A. Irvine
 */
public class A085232 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085232() {
    super(1, 6, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      final Z[] p = fs.toZArray();
      return p[0].pow(fs.getExponent(p[0])).compareTo(p[p.length - 1].pow(fs.getExponent(p[p.length - 1]))) < 0;
    });
  }
}
