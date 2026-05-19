package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395778 Squarefree numbers k with least prime factor p and m distinct prime factors, such that not all larger prime factors q &gt; p are less than p^m.
 * @author Sean A. Irvine
 */
public class A395778 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395778() {
    super(1, 10, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      if (!fs.isSquareFree()) {
        return false;
      }
      final Z[] p = fs.toZArray();
      if (p.length <= 1) {
        return false;
      }
      return p[p.length - 1].compareTo(p[0].pow(p.length)) >= 0;
    });
  }
}
