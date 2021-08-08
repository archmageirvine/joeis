package irvine.oeis.a049;
// manually 2021-08-06

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049884 a(n) = a(1) + a(2) + ... + a(n-1) - a(m) for n &gt;= 3, where m = 2*n - 3 - 2^(p+1) and p is the unique integer such that 2^p &lt; n-1 &lt;= 2^(p+1), with a(1) = a(2) = 1.
 * p is the unique integer such that 2^p &lt; n-1 &lt;= 2^(p+1), with a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A049884 implements Sequence {

  protected final ArrayList<Z> mA; // remembers which terms are already in the sequence
  protected int mN; // current index n
  protected int mLen; // number of initial terms + 1
  protected int mSign; // sign of a(m)
  protected Z mSum; // first part of the sum

  /**
   * Computes the term 2^p in the formulae 
   * @param n index
   * @return 2^(p+0)
   */
  protected static int p0(final int n) {
    return Integer.highestOneBit(n - 2);
  }
  
  /**
   * Computes the term 2^(p+1) in the formulae 
   * @param n index
   * @return 2^(p+1)
   */
  protected static int p1(final int n) {
    return Integer.highestOneBit(n - 2) << 1;
  }
  
  /** Construct the sequence. */
  public A049884() {
    this(-1, 1, 1);
  }

  /**
   * Generic constructor with parameter
   * @param initList sign of a(m) followed by the inital values for a(1), a(2) and so on
   */
  public A049884(final int ... initList) {
    mA = new ArrayList<>(128);
    mLen = initList.length;
    for (int i = 0; i < mLen; ++i) {
      mA.add(Z.valueOf(initList[i]));
    }
    mSign = initList[0];
    mSum = Z.ZERO;
    mN = 0;
  }

  /**
   * Gets <code>m = 2 * n - 3 - p1(n)</code>
   * @param n index
   * @return m
   */
  public int getM(final int n) {
  /*
    final int m = 2 * n - 3 - p1(n);
    final Z am = mA.get(m);
    System.out.println("\nmN=" + mN + ", mSum:" + mSum + " + am(" + m + "):" + am 
        + ", p0(" + n + ")=" + p0(n) + " < " + (n - 1) + " <= " + p1(n) + "=p1(" + n + ")" );
  */
    return 2 * n - 3 - p1(n);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < mLen) {
      final Z an = mA.get(mN);
      mSum = mSum.add(an);
      return an;
    }
    final Z result = mSign < 0 ? mSum.subtract(mA.get(getM(mN))) : mSum.add(mA.get(getM(mN)));
    mA.add(result);
    mSum = mSum.add(result);
    return result;
  }
}
