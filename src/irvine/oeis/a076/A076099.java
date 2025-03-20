package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076099 Triangle read by rows in which the n-th row contains n numbers not occurring in the previous rows whose product is an n-th power. The first (n-1) numbers of the n-th row are the smallest number not occurring earlier and the n-th term is chosen to satisfy the requirement.
 * @author Sean A. Irvine
 */
public class A076099 extends Sequence1 {

  private final TreeSet<Z> mUsed = new TreeSet<>(); // keeps used numbers > mS
  protected final List<Z> mA = new ArrayList<>(); // the current row
  private int mK = 0; // position we are in mA during output
  private int mN = 0;
  private Z mS = Z.TWO; // least unused number

  protected void step() {
    mA.clear();
    mK = 0;
    if (++mN == 1) {
      mA.add(Z.ONE);
      return;
    }
    Z prod = Z.ONE;
    Z m = mS;
    // The first n-1 numbers are simply the smallest not yet used
    for (int k = 0; k < mN - 1; ++k) {
      while (!mUsed.add(m)) {
        m = m.add(1);
      }
      prod = prod.multiply(m);
      mA.add(m);
    }

    // Now make prod a nth power with one more term

    // Factor current product and make everything a square
    final FactorSequence fs = Jaguar.factor(prod);
    Z u = Z.ONE; // a product of values that must appear in the final term
    for (final Z p : fs.toZArray()) {
      final long r = fs.getExponent(p) % mN;
      if (r != 0) {
        u = u.multiply(p.pow(mN - r));
      }
    }
    // We can multiply u by a nth power
    long b = 0;
    while (true) {
      final Z v = u.multiply(Z.valueOf(++b).pow(mN));
      if (v.compareTo(m) > 0 && mUsed.add(v)) { // v > m covers implicitly already used numbers
        // prod * v is a square
        mA.add(v);
        break;
      }
    }
    while (mUsed.remove(mS)) {
      mS = mS.add(1);
    }
  }

  @Override
  public Z next() {
    if (++mK >= mA.size()) {
      step();
    }
    return mA.get(mK);
  }
}
