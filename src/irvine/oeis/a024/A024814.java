package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A024814 Least k such that tan(k) &gt; tan(a(n-1)), for n &gt;= 1, where a(0) = 0.
 * @author Sean A. Irvine
 */
public class A024814 extends AbstractSequence {

  /* Construct the sequence. */
  public A024814() {
    super(0);
  }

  private long mN = -1;
  private CR mTan = CR.valueOf(-1);

  @Override
  public Z next() {
    while (true) {
      final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
      if (tan.compareTo(mTan) > 0) {
        mTan = tan;
        return Z.valueOf(mN);
      }
    }
  }
}
