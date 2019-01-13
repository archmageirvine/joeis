package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000236.
 * @author Sean A. Irvine
 */
public class A000236 implements Sequence {

  private int mN = 1;
  private final Fast mPrime = new Fast();

  // This is much harder than it looks
  // I've had a couple of goes at computing this
  // Might not be simple residue classes


  //equivalently, there is no n-th power residue modulo p in the sequence 1/2,2/3,...,(m-1)/m
  private boolean checkc(final int n, final long x) {
    Z p = Z.ONE;
    while (true) {
      if ((p = mPrime.nextPrime(p)).compareTo(Z.valueOf(x)) >= 0) {
        break;
      }
      final Z inv = Z.valueOf(x + 1).modInverse(p);
      final Z res = inv.modMultiply(x, p);
      res.root(n);
      if (res.auxiliary() == 1) {
        return false;
      }
    }
    System.out.println("tur");
    return true;
  }

  private long checkc(final int n) {
    long x = 1;
    while (checkc(n, x)) {
      ++x;
    }
    return x;
  }
  /*
  private boolean check(final int n, final long x) {
    long prev = 1;
    long p = 1;
    while ((p = mPrime.nextPrime(p)) < x) {
      if (LongUtils.modPow(x, n, p) == LongUtils.modPow(x + 1, n, p)) {
        System.out.println("p was " + p);
        return false;
      }
    }
    return true;
  }

  private long check(final int n) {
    long x = 1;
    while (true) {
      if (!check(n, x)) {
        System.out.println(x);
      }
      ++x;
    }
    //    return x - 1;
  }

  private long checkb(final int n, final long p) {
    long prev = 1;
    long x = 1;
    while (++x < p) {
      final long residue = LongUtils.modPow(x, n, p);
      if (residue == prev) {
        return x - 1;
      }
      prev = residue;
    }
    return -1;
  }

  private long checkb(final int n) {
    long p = 1;
    while (p < 100) {
      p = mPrime.nextPrime(p);
      System.out.println(p + " " + checkb(n, p));
    }
    //    return 0;
    throw new RuntimeException();
  }
  */


  @Override
  public Z next() {
    throw new UnsupportedOperationException(Z.valueOf(checkc(++mN)).toString());
    /*
    int p = 1;
    while (true) {
      p = (int) mPrime.nextPrime(p);
      final boolean[] nthPowerResidues = new boolean[p];
      for (int k = 1; k < p; ++k) {
        nthPowerResidues[IntegerUtils.modPow(k, mN, p)] = true;
      }
      System.out.println("p=" + p);
      for (int k = 1; k < p - 1; ++k) {
        if (nthPowerResidues[k] && nthPowerResidues[k + 1]) {
          return Z.valueOf(k);
        }
      }
    }
    */
    /*
    long m = 2;
    DynamicLongArray old = new DynamicLongArray();
    while (true) {
      long p = 1;
      int k = -1;
      final DynamicLongArray next = new DynamicLongArray();
      long lim = 1;
      for (int j = 0; j < m; ++j) {
        lim *= m;
      }
      while ((p = mPrime.nextPrime(p)) <= lim) {
        ++k;
        final long r = LongUtils.modPow(m, mN, p);
        if (k < old.length() && old.get(k) == r) {
          System.out.println("r=" + r + " m=" + m + " p=" + p + " k=" + k);
          return Z.valueOf(m - 1);
        }
        next.set(k, r);
      }
      old = next;
      ++m;
    }
    */
  }
}
