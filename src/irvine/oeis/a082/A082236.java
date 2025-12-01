package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082236 a(1) = 1 and then numbers such that the product of n terms starting with the n-th term is an n-th power. The smallest numbers not occurring earlier are used first.
 * @author Sean A. Irvine
 */
public class A082236 extends CachedSequence {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mLeastUnused = Z.TWO;

  /** Construct the sequence. */
  public A082236() {
    super(1);
  }

  @Override
  protected Z compute(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    if (n.isEven()) {
      mUsed.add(mLeastUnused);
      return mLeastUnused;
    }
    final int power = n.add(1).divide2().intValueExact();
    final FactorSequence fs = new FactorSequence();
    for (int k = 0; k < power - 1; ++k) {
      fs.add(a(power + k), FactorSequence.UNKNOWN);
    }
    Jaguar.factor(fs);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p) % power;
      if (e != 0) {
        prod = prod.multiply(p.pow(power - e));
      }
    }
    //System.out.println(n + " " + fs.product() + "=" + FactorSequence.toString(fs) + " " + prod);
    // prod is now the minimal completion of the power
    long m = 0;
    while (true) {
      final Z t = prod.multiply(Z.valueOf(++m).pow(power));
      if (t.compareTo(mLeastUnused) > 0 && mUsed.add(t)) {
        return t;
      }
    }
  }
}
