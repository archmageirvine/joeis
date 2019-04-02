package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.FactorizationSequence;

/**
 * A005266 a(1)=3, b(n)=Product_{k=1..n} a(k), a(n+1)=largest prime factor of b(n)-1.
 * @author Sean A. Irvine
 */
public class A005266 extends FactorizationSequence {

  /**
   * Construct this sequence.
   */
  public A005266() {
    super("irvine/factor/project/oeis/a005266");
  }

  @Override
  protected Z getTerm(final String factorization, final Z n) {
    final String[] p = factorization.split("\\.");
    final String lpf = p[p.length - 1];
    if (lpf.startsWith("(")) {
      throw new UnsupportedOperationException("Unfactored: " + n);
    }
    return new Z(lpf);
  }
}
