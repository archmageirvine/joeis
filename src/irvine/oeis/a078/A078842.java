package irvine.oeis.a078;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A078842 Sums of the antidiagonals of the table of k-almost primes (A078840).
 * @author Sean A. Irvine
 */
public class A078842 extends A078840 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? super.next() : Integers.SINGLETON.sum(1, mN, k -> super.next());
  }
}
