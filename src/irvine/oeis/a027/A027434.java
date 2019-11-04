package irvine.oeis.a027;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027434 <code>a(1) = 2</code>; then defined by property that <code>a(n) =</code> smallest number <code>&gt;= a(n-1)</code> such that successive runs have lengths 1,1,2,2,3,3,4,4.
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
