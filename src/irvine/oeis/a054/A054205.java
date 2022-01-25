package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A054205 Consider all integer triples (i,j,k), j &gt;= k &gt; 0, with binomial(i+2,3)=j^3+k^3, ordered by increasing i; sequence gives i values.
 * @author Sean A. Irvine
 */
public class A054205 implements Sequence {

  private final List<Triple<Long>> mA = new ArrayList<>();
  private long mN = 4;
  private int mM = 0;

  protected long select(final Triple<Long> t) {
    return t.left();
  }

  @Override
  public Z next() {
    if (mM >= mA.size()) {
      mA.clear();
      mM = 0;
      do {
        final Z t = Binomial.binomial(++mN + 2, 3);
        Z k3, j3;
        for (long k = 1; (k3 = Z.valueOf(k).pow(3)).compareTo(j3 = t.subtract(k3)) <= 0; ++k) {
          final Z j = j3.root(3);
          if (j3.auxiliary() == 1) {
            mA.add(new Triple<>(mN, j.longValueExact(), k));
          }
        }
      } while (mA.isEmpty());
    }
    return Z.valueOf(select(mA.get(mM++)));
  }
}

