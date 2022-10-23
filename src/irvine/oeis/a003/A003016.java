package irvine.oeis.a003;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003016 Number of occurrences of n as an entry in rows &lt;= n of Pascal's triangle (A007318).
 * @author Sean A. Irvine
 */
public class A003016 extends Sequence0 {

  private Z[] mPascal = null;
  private Z mN = Z.NEG_ONE;
  private final HashMap<Z, Long> mCount = new HashMap<>();

  @Override
  public Z next() {
    if (mPascal == null) {
      mPascal = new Z[]{Z.ONE};
    } else {
      final Z[] row = new Z[mPascal.length + 1];
      Z p = Z.ZERO;
      for (int k = 0; k < row.length; ++k) {
        final Z q = k < mPascal.length ? mPascal[k] : Z.ZERO;
        row[k] = p.add(q);
        p = q;
      }
      mPascal = row;
    }
    for (final Z t : mPascal) {
      final Long c = mCount.get(t);
      if (c == null) {
        mCount.put(t, 1L);
      } else {
        mCount.put(t, c + 1);
      }
    }
    mN = mN.add(1);
    final Long c = mCount.remove(mN);
    return c == null ? Z.ZERO : Z.valueOf(c);
  }
}
