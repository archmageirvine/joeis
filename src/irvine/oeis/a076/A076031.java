package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A076031 Group the natural numbers so that the n-th group contains the smallest still-available set of n numbers whose product is a square.
 * @author Sean A. Irvine
 */
public class A076031 extends Sequence1 {

  private final TreeSet<Z> mUsed = new TreeSet<>(); // keeps used numbers > mS
  protected final List<Z> mA = new ArrayList<>(); // the current row
  private int mK = 0; // position we are in mA during output
  private long mN = 0;
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
    for (long k = 0; k < mN - 1; ++k) {
      while (!mUsed.add(m)) {
        m = m.add(1);
      }
      prod = prod.multiply(m);
      mA.add(m);
    }

    // Now make prod a square with one more term

    // Factor current product and make everything a square
    final FactorSequence fs = Jaguar.factor(prod);
    Z u = Z.ONE; // a product of values that must appear in the final term
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1) {
        u = u.multiply(p);
      }
    }
    // We can multiply u by a square until we find the smallest not previous used
    final Sequence squares = new A000290().skip();
    while (true) {
      final Z v = u.multiply(squares.next());
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
