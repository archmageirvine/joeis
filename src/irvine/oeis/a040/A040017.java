package irvine.oeis.a040;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a007.A007615;

/**
 * A040017 Prime 3 followed by unique period primes (the period r of 1/p is not shared with any other prime) of the form A019328(r)/gcd(A019328(r),r) in order (periods r are given in A051627).
 * @author Sean A. Irvine
 */
public class A040017 extends A007615 {

  // Heuristic for sorting, make this bigger if terms observed are out order
  private static final int SORT_SIZE = 10;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.size() < SORT_SIZE) {
      mA.add(super.next());
    }
    return mA.pollFirst();
  }
}
