package irvine.oeis.a393;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393747 allocated for Dimana Pramatarova.
 * @author Sean A. Irvine
 */
public class A393747 extends Sequence1 {

  /*
n = 6
s = 6

def count_paths_with_s_peaks(x_rem, y_rem, z_rem, x_used, y_used, z_used, last_char, s_needed):
    if x_rem == 0 and y_rem == 0 and z_rem == 0:
        return 1 if s_needed == 0 else 0

    if not (x_used >= y_used >= z_used):
        return 0
    if s_needed < 0:
        return 0
    total = 0
    if x_rem > 0:
        total += count_paths_with_s_peaks(x_rem - 1, y_rem, z_rem,
                                  x_used + 1, y_used, z_used,
                                  0, s_needed)

    if y_rem > 0 and x_used >= y_used + 1:
        total += count_paths_with_s_peaks(x_rem, y_rem - 1, z_rem,
                                  x_used, y_used + 1, z_used,
                                  1, s_needed)

    if z_rem > 0 and y_used >= z_used + 1:
        used = 1 if last_char == 0 else 0
        total += count_paths_with_s_peaks(x_rem, y_rem, z_rem - 1, x_used, y_used, z_used + 1, 2, s_needed - used)
    return total
result = count_paths_with_s_peaks(n, n, n, 0, 0, 0, -1, s)
   */

  private final HashMap<String, Z> mCache = new HashMap<>();
  private int mN = 1;
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
      mM = 1;
    }
    return get(mN, mN, mN, 0, 0, 0, -1, mM);
  }
}

