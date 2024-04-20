package irvine.oeis.a063;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002808;

/**
 * A063248 Smallest composite number in base n which contains its largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063248 extends Sequence2 {

  private long mN = 1;

  private List<Long> baseExpansion(Z n, final Z base) {
    final ArrayList<Long> res = new ArrayList<>();
    do {
      final Z[] qr = n.divideAndRemainder(base);
      res.add(qr[1].longValue());
      n = qr[0];
    } while (!n.isZero());
    return res;
  }

  private boolean is(final Z c, final long base) {
    final Z b = Z.valueOf(base);
    final Z largestProperFactor = c.divide(Functions.LPF.z(c));
    final List<Long> x = baseExpansion(c, b);
    final List<Long> y = baseExpansion(largestProperFactor, b);
    for (int k = 0; k <= x.size() - y.size(); ++k) {
      if (x.subList(k, k + y.size()).equals(y)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final Sequence composites = new A002808();
    while (true) {
      final Z c = composites.next();
      if (is(c, mN)) {
        return c;
      }
    }
  }
}
