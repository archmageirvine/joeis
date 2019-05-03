package irvine.oeis.a054;

import irvine.factor.factor.PrimeDivision;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054225 Triangle read by rows: row <code>n (n&gt;=0)</code> gives the number of partitions of <code>(n,0), (n-1,1), (n-2,2)</code>, ..., <code>(0,n)</code> respectively into sums of pairs.
 * @author Sean A. Irvine
 */
public class A054225 extends MemoryFunction2<Z, Z> implements Sequence {

  // After method of Alois P. Heinz

  // p and q are usually small so simple factor strategy will work
  private final PrimeDivision mFactor = new PrimeDivision();
  private int mN = -1;
  private int mK = 0;

  @Override
  protected Z compute(final Z n, final Z k) {
    Z s = Z.ZERO;
    if (!n.isPrime()) {
      for (final Z d : mFactor.factorize(n).divisors()) {
        if (!Z.ONE.equals(d) && !n.equals(d) && d.compareTo(k) <= 0) {
          s = s.add(get(n.divide(d), d));
        }
      }
    }
    if (n.compareTo(k) <= 0) {
      s = s.add(1);
    }
    return s;
  }

  protected Z t(final int n, final int k) {
    final Z r = Z.THREE.pow(k).shiftLeft(n - k);
    return get(r, r);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mN, mK);
  }
}
