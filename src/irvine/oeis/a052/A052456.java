package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052456 Number of magic series of order n.
 * @author Sean A. Irvine
 */
public class A052456 implements Sequence {

  // After Robert Gerbicz

  private final Fast mPrime = new Fast();
  private int mD = -1;

  @Override
  public Z next() {
    if (++mD == 0) {
      return Z.ONE;
    }

    final int numPrimes = (int) (mD * (Math.log(mD) + 1.0) / Math.log(2) / 30.0 + 1.0);
    final long[] prime = new long[mD + 1];
    final long[][] res = new long[numPrimes + 1][];
    for (int i = 1; i <= numPrimes; i++) {
      res[i] = new long[mD + 1];
    }
    long p = 2147483647;
    int usedPrimes = 0;
    int completedD = 0;

    Z seqz = Z.ZERO;

    // Perhaps make dynamic array
    final long[][] a = new long[mD + 1][];

    for (int i = 0; i <= mD; i++) {
      a[i] = new long[(1 + ((mD * mD / 2 + 1) * i + 1) / 2)];
    }

    while (usedPrimes < numPrimes) {
      p--;
      if (mPrime.isPrime(p)) {
        usedPrimes++;
        prime[usedPrimes] = p;

        for (int i = 0; i <= mD; i++) {
          for (int j = 0; j <= ((mD * mD / 2 + 1) * i + 1) / 2; j++) {
            a[i][j] = 0;
          }
        }

        a[0][0] = 1;
        res[usedPrimes][1] = 1;

        int x = 2;
        int y = 2;

        for (int i = 1; i <= mD * mD / 2; i++) {
          for (int j = 1; j <= mD; j++) {
            for (int k = (i * j + 1) / 2 + 1; k <= ((i + 1) * j + 1) / 2; k++) {
              a[j][k] = a[j][i * j - k];
            }
          }

          for (int j = mD; j >= 1; j--) {
            final int j1 = j - 1;
            for (int k = i; k <= ((i + 1) * j + 1) / 2; k++) {
              a[j][k] += a[j1][k - i];
              if (a[j][k] >= p) {
                a[j][k] -= p;
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
              for (int m = start0; m <= end0; m++) {
                final int c1 = m <= ((i + 1) * j + 1) / 2 ? m : (i + 1) * j - m;
                final int c2 = sum - m <= ((i + 1) * (x - j) + 1) / 2 ? sum - m : (i + 1) * (x - j) - (sum - m);
                s += a[j][c1] * a[x - j][c2];
                s = s % p;
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
                  s += a[j1][c1] * a[x - j][c2];
                  s = s % p;
                }
              }
            }

            long re = s;
            res[usedPrimes][x] = re;

            x++;
            y = x * x / 2;
          }
        }

        while ((completedD + 1 <= mD) && ((int) ((1 + completedD) * (Math.log(1 + completedD) + 1.0) / Math.log(2) / 30.0 + 1.0) <= usedPrimes)) {
          completedD++;
          Z bigT = Z.ONE;
          seqz = Z.ZERO;
          for (int j = 1; j <= usedPrimes; ++j) {
            long re = res[j][completedD];
            final long q = prime[j];
            final Z pz = Z.valueOf(q);
            final long r = (int) seqz.mod(q);
            if (re < r) {
              re = q + re - r;
            } else {
              re = re - r;
            }
            final Z sz = bigT.modInverse(pz).multiply(re).mod(pz).multiply(bigT);
            seqz = seqz.add(sz);
            bigT = bigT.multiply(q);
          }
          // todo this is redoing work for all earlier terms
          //System.out.println(seqz);
        }
      }
    }
    return seqz;
  }
}

