package irvine.oeis.a393;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393747 Triangle read by rows: T(n, k) is the number of 3-dimensional balanced ballot paths of length 3n with exactly k semisymmetric peaks for 0 &lt;= k &lt; n if n &gt;=1 and for k=0 if n=0.
 * @author Sean A. Irvine
 */
public class A393747 extends Sequence0 {

  private final HashMap<String, Z> mCache = new HashMap<>();
  private int mN = -1;
  private int mM = 0;

  private Z compute(final int xRem, final int yRem, final int zRem, final int xUsed, final int yUsed, final int zUsed, final int lastChar, final int sNeeded) {
    if (xRem == 0 && yRem == 0 && zRem == 0) {
      return sNeeded == 0 ? Z.ONE : Z.ZERO;
    }
    if (!(xUsed >= yUsed && yUsed >= zUsed)) {
      return Z.ZERO;
    }
    if (sNeeded < 0) {
      return Z.ZERO;
    }
    Z total = Z.ZERO;
    if (xRem > 0) {
      total = total.add(get(xRem - 1, yRem, zRem, xUsed + 1, yUsed, zUsed, 0, sNeeded));
    }
    if (yRem > 0 && xUsed >= yUsed + 1) {
      total = total.add(get(xRem, yRem - 1, zRem, xUsed, yUsed + 1, zUsed, 1, sNeeded));
    }
    if (zRem > 0 && yUsed >= zUsed + 1) {
      final int used = lastChar == 0 ? 1 : 0;
      total = total.add(get(xRem, yRem, zRem - 1, xUsed, yUsed, zUsed + 1, 2, sNeeded - used));
    }
    return total;
  }

  private Z get(final int xRem, final int yRem, final int zRem, final int xUsed, final int yUsed, final int zUsed, final int lastChar, final int sNeeded) {
    final String key = xRem + "," + yRem + "," + zRem + "," + xUsed + "," + yUsed + "," + zUsed + "," + lastChar + "," + sNeeded;
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z t = compute(xRem, yRem, zRem, xUsed, yUsed, zUsed, lastChar, sNeeded);
    mCache.put(key, t);
    return t;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN, mN, 0, 0, 0, -1, mM);
  }
}

