package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000275.
 * @author Sean A. Irvine
 */
public class A000275 implements Sequence {

  protected int mN = -1;
  protected final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    final Z res;
    if (++mN == 0) {
      res = Z.ONE;
    } else {
      Z t = Z.ZERO;
      for (int r = 0; r < mN; ++r) {
        final Z z = Binomial.binomial(mN, r).square().multiply(mA.get(r));
        t = t.signedAdd(((r + mN) & 1) != 0, z);
      }
      res = t;
    }
    mA.add(res);
    return res;
  }
}
