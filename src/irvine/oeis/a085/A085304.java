package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A085304 Least number of 4th powers required to represent <code>n!</code>.
 * @author Sean A. Irvine
 */
public class A085304 implements Sequence {

  private boolean containsZero(final LongDynamicByteArray a, final long limit) {
    for (long k = 0; k < limit; ++k) {
      if (a.get(k) == 0) {
        return true;
      }
    }
    return false;
  }

  private LongDynamicByteArray findWithLimit(final long limit) {
    final LongDynamicByteArray minCount = new LongDynamicByteArray();
    final int baseLimit = (int) Math.pow(limit, 0.25);
    final long[] quarts = new long[baseLimit];
    //long solved = 1;
    minCount.set(0, (byte) 1);
    for (int k = 1; k <= baseLimit; ++k) {
      final long u = k * k;
      final long v = u * u;
      quarts[k - 1] = v;
      minCount.set(v, (byte) 1);
      //solved++;
    }
    while (containsZero(minCount, limit)) {
      //System.out.println("Solved: " + solved + "/" + limit);
      for (long k = limit - 1; k > 0; --k) {
        final int w = minCount.get(k);
        if (w > 0) {
          minCount.set(k, (byte) -w);
          for (final long q : quarts) {
            final long t = k + q;
            if (t < limit && minCount.get(t) == 0) {
              if (w == 127) {
                throw new RuntimeException();
              }
              minCount.set(t, (byte) (w + 1));
              //solved++;
            }
          }
        }
      }
    }
    //System.out.println("Solved: " + solved + "/" + limit);
    return minCount;
  }

  long mF = 0;
  long mN = 0;

  @Override
  public Z next() {
    if (mF == 0) {
      mF = 1;
      return Z.ONE;
    }
    mF *= ++mN;
    return Z.valueOf(Math.abs(findWithLimit(mF + 1).get(mF)));
  }

  /**
   * Generate with proofs.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    final A085304 seq = new A085304();
    final LongDynamicByteArray r = seq.findWithLimit(40320L * 9 * 10 * 11 * 12 * 13 + 1);
    System.out.println("1! " + r.get(1));
    System.out.println("2! " + r.get(2));
    System.out.println("3! " + r.get(6));
    System.out.println("4! " + r.get(24));
    System.out.println("5! " + r.get(120));
    System.out.println("6! " + r.get(720));
    System.out.println("7! " + r.get(5040));
    System.out.println("8! " + r.get(40320));
    System.out.println("9! " + r.get(40320L * 9));
    System.out.println("10! " + r.get(40320L * 9 * 10));
    System.out.println("11! " + r.get(40320L * 9 * 10 * 11));
    System.out.println("12! " + r.get(40320L * 9 * 10 * 11 * 12));
    System.out.println("13! " + r.get(40320L * 9 * 10 * 11 * 12 * 13));
  }
}

