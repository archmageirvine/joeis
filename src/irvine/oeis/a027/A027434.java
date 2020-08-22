package irvine.oeis.a027;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027434 a(1) = 2; then defined by property that a(n) = smallest number &gt;= a(n-1) such that successive runs have lengths 1,1,2,2,3,3,4,4.
 * @author Sean A. Irvine
 */
public class A027434 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.ONE.add(LongUtils.sqrt(mN));
  }
}
