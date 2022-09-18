package irvine.oeis.a059;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;

/**
 * A059347 Difference array of Motzkin numbers A001006 read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A059347 extends A001006 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      Z t = super.next();
      for (int k = 0; k < mA.size(); ++k) {
        final Z u = t;
        t = t.subtract(mA.get(k));
        mA.set(k, u);
      }
      mA.add(t);
      mM = mA.size() - 1;
    }
    return mA.get(mM);
  }
}
