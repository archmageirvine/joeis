package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.LinkedList;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006339.
 * @author Sean A. Irvine
 */
public class A006339 implements Sequence {

  // After Albert H. Mao

  private int mN = -1;
  private final ArrayList<Z> mOneModFourPrimes = new ArrayList<>();
  private final Fast mPrime = new Fast();
  {
    mOneModFourPrimes.add(Z.FIVE);
  }

  private void ensurePrimes(final int limit) {
    Z p = mOneModFourPrimes.get(mOneModFourPrimes.size() - 1);
    while (mOneModFourPrimes.size() <= limit) {
      p = mPrime.nextPrime(p);
      if (p.mod(4) == 1) {
        mOneModFourPrimes.add(p);
      }
    }
  }

  private ArrayList<LinkedList<Integer>> factorizations(final int n, final int limit) {
    final ArrayList<LinkedList<Integer>> res = new ArrayList<>();
    if (n == 1) {
      res.add(new LinkedList<>());
    } else {
      for (final Z dd : Cheetah.factor(n).divisors()) {
        final int d = dd.intValueExact();
        if (d > 1 && d <= limit) {
          for (final LinkedList<Integer> z : factorizations(n / d, d)) {
            z.addFirst(d);
            res.add(z);
          }
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    Z min = null;
    for (final LinkedList<Integer> f : factorizations(2 * mN + 1, 2 * mN + 1)) {
      ensurePrimes(f.size());
      Z prod = Z.ONE;
      int k = 0;
      for (final int d : f) {
        prod = prod.multiply(mOneModFourPrimes.get(k++).pow((d - 1) / 2));
      }
      if (min == null || min.compareTo(prod) > 0) {
        min = prod;
      }
    }
    return min;
  }

}
