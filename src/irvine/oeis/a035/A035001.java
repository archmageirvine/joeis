package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A035001 Sorted elements of table (A035002) of a(m,n) = sum(a(m-k,n), k=1..m-1)+sum(a(m,n-k), k=1..n-1).
 * @author Sean A. Irvine
 */
public class A035001 extends A035002 {

  /** Construct the sequence. */
  public A035001() {
    super(0);
  }

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(get(mN, 1)) >= 0) {
      ++mN;
      for (int m = 1; m <= mN; ++m) {
        mA.add(get(mN - m + 1, m));
      }
    }
    return mA.pollFirst();
  }
}
