package irvine.oeis.a067;

/**
 * A067401 Minimal non-uniquely factorizable OR-numbrals, i.e., numbrals that are not uniquely factorizable but for which all proper divisors are.
 * @author Sean A. Irvine
 */
public class A067401 extends A067400 {

  @Override
  protected boolean accept(final int n) {
    if (mFactorizations.get(n).size() <= 1) {
      return false;
    }
    for (final int d : mDivisors.get(n)) {
      if (d != n && mFactorizations.get(d).size() > 1) {
        return false;
      }
    }
    return true;
  }
}
