package irvine.oeis.a059;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A059346 Difference array of Catalan numbers A000108 read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A059346 extends A000108 {

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
