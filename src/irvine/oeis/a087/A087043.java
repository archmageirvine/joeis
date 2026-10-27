package irvine.oeis.a087;

import java.util.ArrayList;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087043 Partial quotients of the continued fraction of a number x such that exp(1) added to each partial quotient evaluates to x+2.
 * @author Sean A. Irvine
 */
public class A087043 extends Sequence0 {

  protected final List<Z> mA = new ArrayList<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A087043() {
    mA.add(Z.ONE);
    mA.add(Z.valueOf(71));
    mA.add(Z.ONE);
  }

  protected static CR evaluate(final List<Z> a) {
    CR v = CR.E.add(CR.valueOf(a.get(a.size() - 1)));
    for (int k = a.size() - 2; k >= 0; --k) {
      v = CR.E.add(CR.valueOf(a.get(k))).add(v.inverse());
    }
    return CR.E.add(v.inverse());
  }

  private static Z quotient(CR x, final int index) {
    Z a = Z.ZERO;
    for (int k = 0; k <= index; ++k) {
      // Replace this call with your existing Z floor(CR x) helper if needed.
      a = x.floor();
      if (k < index) {
        x = x.subtract(CR.valueOf(a)).inverse();
      }
    }
    return a;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    if (mN <= mA.size()) {
      return mA.get(mN - 1);
    }
    // Greedily predict the next partial quotient from the current prefix.
    final CR x = evaluate(mA).subtract(CR.TWO);
    final Z a = quotient(x, mA.size() + 1);
    mA.add(a);
    return a;
  }
}
