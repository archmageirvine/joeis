package irvine.oeis.a002;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002473 7-smooth numbers: positive numbers whose prime divisors are all <code>&lt;= 7</code>.
 * @author Sean A. Irvine
 */
public class A002473 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply2());
    mPriority.add(r.multiply(3));
    mPriority.add(r.multiply(5));
    mPriority.add(r.multiply(7));
    return r;
  }
}
