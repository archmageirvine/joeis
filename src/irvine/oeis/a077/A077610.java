package irvine.oeis.a077;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077610 Triangle in which n-th row lists unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A077610 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;
  private List<Z> mA = Collections.emptyList();

  /**
   * Return a sorted list of the unitary divisors of a number.
   * @param n number
   * @return unitary divisors
   */
  public static List<Z> unitaryDivisors(final long n) {
    final List<Z> lst = new ArrayList<>();
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (Functions.GCD.l(d, n / d.longValueExact()) == 1) {
        lst.add(d);
      }
    }
    Collections.sort(lst);
    return lst;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA = unitaryDivisors(++mN);
      mM = 0;
    }
    return mA.get(mM);
  }
}
