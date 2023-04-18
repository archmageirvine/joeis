package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A063046 Length of non-periodic head in Collatz-2 (A063041) trajectory starting at n.
 * @author Sean A. Irvine
 */
public class A063046 extends A063041 {

  private long mN = 1;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    final TreeSet<Z> seen = new TreeSet<>();
    while (seen.add(a)) {
      a = collatz2(a);
    }
    return Z.valueOf(seen.size());
  }
}
