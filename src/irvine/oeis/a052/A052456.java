package irvine.oeis.a052;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052456 Number of magic series of order n.
 * @author Sean A. Irvine
 */
public class A052456 implements Sequence {

  // After Robert Gerbicz
  // (Note this could perhaps be made incremental!)

  private final Fast mPrime = new Fast();
  private int mD = -1;

  @Override
  public Z next() {
    if (++mD == 0) {
      return Z.ONE;
    }

    final int numPrimes = (int) (mD * (Math.log(mD) + 1.0) / Math.log(2) / 30.0 + 1.0);
    final long[] prime = new long[mD + 1];
    final long[][] res = new long[numPrimes + 1][mD + 1];
    long p = 2147483647;
    int usedPrimes = 0;
    int completedD = 0;

    Z seqz = Z.ZERO;

    final List<long[]> a = new ArrayList<>();
    for (int i = 0; i <= mD; ++i) {
      a.add(new long[1 + ((mD * mD / 2 + 1) * i + 1) / 2]);
    }

    while (usedPrimes < numPrimes) {
      p = mPrime.prevPrime(p);
      prime[++usedPrimes] = p;

      for (final long[] ai : a) {
        Arrays.fill(ai, 0);
      }

      a.get(0)[0] = 1;
      res[usedPrimes][1] = 1;

      int x = 2;
      int y = 2;

      for (int i = 1; i <= mD * mD / 2; ++i) {
        for (int j = 1; j <= mD; ++j) {
          for (int k = (i * j + 1) / 2 + 1; k <= ((i + 1) * j + 1) / 2; ++k) {
            a.get(j)[k] = a.get(j)[i * j - k];
          }
        }

        for (int j = mD; j >= 1; --j) {
          final int j1 = j - 1;
          for (int k = i; k <= ((i + 1) * j + 1) / 2; ++k) {
            a.get(j)[k] += a.get(j1)[k - i];
            if (a.get(j)[k] >= p) {
              a.get(j)[k] -= p;
            }
          }
        }

        if (i == y) {
          long s = 0;
          for (int j = (x * (x * x + 1) / 2) % 2; j <= x; j += 2) {
            final int sum = (x * (x * x + 1) + 2 * j) / 4;
            final int s1 = j * (j + 1) / 2;
            final int s2 = (x - j) * (x - j + 1) / 2;
            int u1 = j * (2 * y + 1 - j) / 2;
            int u2 = (x - j) * (2 * y + 1 - (x - j)) / 2;
            if (sum < u2) {
              u2 = sum;
            }
            if (sum < u1) {
              u1 = sum;
            }
            final int start0 = Math.max(s1, sum - u2);
            final int end0 = Math.min(u1, sum - s2);
            for (int m = start0; m <= end0; ++m) {
              final int c1 = m <= ((i + 1) * j + 1) / 2 ? m : (i + 1) * j - m;
              final int c2 = sum - m <= ((i + 1) * (x - j) + 1) / 2 ? sum - m : (i + 1) * (x - j) - (sum - m);
              s += a.get(j)[c1] * a.get(x - j)[c2];
              s %= p;
            }
          }
          if ((x & 1) == 1) {
            for (int j = 2 - ((x * (x * x + 1) / 2) % 2); j <= x; j += 2) {
              final int sum = (x * (x * x + 1) + 2 * j) / 4 - (x * x + 1) / 2;
              final int j1 = j - 1;
              final int s1 = j1 * (j1 + 1) / 2;
              final int s2 = (x - j) * (x - j + 1) / 2;
              int u1 = j1 * (2 * y + 1 - j1) / 2;
              int u2 = (x - j) * (2 * y + 1 - (x - j)) / 2;
              if (sum < u2) {
                u2 = sum;
              }
              if (sum < u1) {
                u1 = sum;
              }
              final int start0 = Math.max(s1, sum - u2);
              final int end0 = Math.min(u1, sum - s2);
              for (int m = start0; m <= end0; m++) {
                final int c1 = m <= ((i + 1) * j1 + 1) / 2 ? m : (i + 1) * j1 - m;
                final int c2 = sum - m <= ((i + 1) * (x - j) + 1) / 2 ? sum - m : (i + 1) * (x - j) - (sum - m);
                s += a.get(j1)[c1] * a.get(x - j)[c2];
                s %= p;
              }
            }
          }

          res[usedPrimes][x] = s;

          ++x;
          y = x * x / 2;
        }
      }

      while ((completedD + 1 <= mD) && ((int) ((1 + completedD) * (Math.log(1 + completedD) + 1.0) / Math.log(2) / 30.0 + 1.0) <= usedPrimes)) {
        if (++completedD == mD) {
          Z bigT = Z.ONE;
          seqz = Z.ZERO;
          for (int j = 1; j <= usedPrimes; ++j) {
            long re = res[j][completedD];
            final long q = prime[j];
            final Z pz = Z.valueOf(q);
            final long r = (int) seqz.mod(q);
            re = re < r ? q + re - r : re - r;
            final Z sz = bigT.modInverse(pz).multiply(re).mod(pz).multiply(bigT);
            seqz = seqz.add(sz);
            bigT = bigT.multiply(q);
          }
        }
      }
    }
    return seqz;
  }
}

