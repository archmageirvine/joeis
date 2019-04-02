package irvine.oeis.a002;

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A002785 Number of self-complementary oriented graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A002785 implements Sequence {

  // After Pab Ter

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private Z mOddTerm = Z.ONE;

  private boolean checkEvenConstraint(final int[] j) {
    for (int k = 0; k < j.length; k += 2) {
      if (j[k] != 0) {
        return false;
      }
    }
    return true;
  }

  private Z product2(final int[] j) {
    int s = 0;
    // all even terms are 0
    for (int k = 1; k < j.length; k += 2) {
      s += k * j[k] * j[k] - j[k];
    }
    // all even terms are 0
    for (int t = 1; t < j.length; t += 2) {
      for (int r = 1; r < t; r += 2) {
        s += 2 * IntegerUtils.gcd(r, t) * j[r] * j[t];
      }
    }
    return Z.ONE.shiftLeft(s);
  }

  private Z product3(final int[] j) {
    Z p = Z.ONE;
    // all even terms are 0
    for (int k = 1; k < j.length; k += 2) {
      p = p.multiply(mF.factorial(j[k]).multiply(Z.valueOf(k).pow(j[k])));
    }
    return p;
  }

  private Z product4(final int[] j) {
    int s = 0;
    // all even terms are 0
    for (int t = 1; t < j.length; t += 2) {
      for (int r = 1; r < j.length; r += 2) {
        s += IntegerUtils.gcd(r, t) * j[r] * j[t];
      }
    }
    return Z.ONE.shiftLeft(s);
  }

  @Override
  public Z next() {
    if (mOddTerm != null) {
      final Z t = mOddTerm;
      mOddTerm = null;
      return t;
    }
    final IntegerPartition part = new IntegerPartition(++mN);
    final int[] j = new int[mN + 1];
    int[] p;
    Q sumEven = Q.ZERO;
    Q sumOdd = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      if (checkEvenConstraint(j)) {
        sumEven = sumEven.add(new Q(product2(j), product3(j)));
        sumOdd = sumOdd.add(new Q(product4(j), product3(j)));
      }
    }
    mOddTerm = sumOdd.toZ();
    return sumEven.toZ();
  }
}
