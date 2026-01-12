package irvine.oeis.a196;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A196047 Path length of the rooted tree with Matula-Goebel number n.
 * @author Sean A. Irvine
 */
public class A196047 extends Sequence1 {

  private long mN = 0;
  private final MemoryFunction<Long, Z[]> mNpl = new MemoryFunction<>() {
    @Override
    protected Z[] compute(final Long n) {
      if (n == 1) {
        return new Z[] {Z.ONE, Z.ZERO};
      }
      final FactorSequence fs = Jaguar.factor(n);
      final Z[] p = fs.toZArray();
      final Z[][] v = new Z[p.length][];
      for (int k = 0; k < p.length; ++k) {
        v[k] = getValue(Functions.PRIME_PI.l(p[k]));
      }
      return new Z[] {
        Z.ONE.add(Integers.SINGLETON.sum(0, p.length - 1, k -> v[k][0].multiply(fs.getExponent(p[k])))),
        Integers.SINGLETON.sum(0, p.length - 1, k -> v[k][0].add(v[k][1]).multiply(fs.getExponent(p[k])))
      };
    }
  };

  @Override
  public Z next() {
    return mNpl.getValue(++mN)[1];
  }
}

