package irvine.oeis.a087;

import java.util.ArrayList;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087041 Partial quotients of the continued fraction of a number x such that Pi added to each partial quotient evaluates to x+3.
 * @author Sean A. Irvine
 */
public class A087041 extends Sequence0 {

  protected final List<Z> mA = new ArrayList<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A087041() {
    mA.add(Z.THREE);
    mA.add(Z.TWO);
    mA.add(Z.ONE);
  }

  /**
   * Evaluate [pi; a[0]+pi, a[1]+pi, ...].
   * @param a partial quotients after the initial pi
   * @return generalized continued fraction
   */
  protected static CR evaluate(final List<Z> a) {
    CR v = CR.PI.add(CR.valueOf(a.get(a.size() - 1)));
    for (int k = a.size() - 2; k >= 0; --k) {
      v = CR.PI.add(CR.valueOf(a.get(k))).add(v.inverse());
    }
    return CR.PI.add(v.inverse());
  }

  /**
   * Extract the partial quotient at the specified index of the ordinary continued fraction of x.
   * Index 0 is the integer part.
   * @param x real number
   * @param index partial quotient index
   * @return partial quotient
   */
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
    final CR x = evaluate(mA).subtract(CR.THREE);
    final Z a = quotient(x, mA.size() + 1);
    mA.add(a);
    return a;
  }
}
