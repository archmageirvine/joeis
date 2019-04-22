package irvine.oeis.a020;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020329 Consider integers z such C(z,4) <code>= C(x,4) +</code> C(y,4), <code>x &gt;=</code> y <code>&gt;= 4,</code> is solvable. Sequence gives values of z.
 * @author Sean A. Irvine
 */
public class A020329 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mC = new TreeSet<>();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z c = Binomial.binomial(++mN, 4);
      if (mVerbose && mN % 10000 == 0) {
        System.out.println("n=" + mN);
      }
      boolean found = false;
      for (final Z v : mC) {
        if (mC.contains(c.subtract(v))) {
          found = true;
          break;
        }
      }
      mC.add(c);
      if (found) {
        return Z.valueOf(mN);
      }
    }
  }
}
