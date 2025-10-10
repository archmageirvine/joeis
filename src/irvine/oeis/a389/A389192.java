package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A389192 Lexicographically earliest sequence, where a(n) - a(n-1) is unique, and a(a(n)) = n.
 * @author Sean A. Irvine
 */
public class A389192 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final HashSet<Long> mDiffs = new HashSet<>();
  private long mN = -1;

  private boolean canPlace(final long pos, final long value) {
    if (mA.get(value) != 0) {
      return false; // Cannot place a(a(n)) = n
    }

    // Temporarily make the placement so diff checking is simpler
    mA.set(pos, value);
    mA.set(value, pos);

    // Check mA(pos) = value
    final long p = mA.get(pos - 1);
    final long dp = value - p;
    if (mDiffs.contains(dp)) {
      mA.set(pos, 0);
      mA.set(value, 0);
      return false; // Left difference already occurred
    }
    final long q = mA.get(pos + 1);
    final long dq = q - value;
    if (q != 0) {
      if (dq == dp) {
        mA.set(pos, 0);
        mA.set(value, 0);
        return false; // Would cause a repeated difference
      }
      if (mDiffs.contains(dq)) {
        mA.set(pos, 0);
        mA.set(value, 0);
        return false; // Right difference already occurred
      }
    }

    if (pos == value) {
      mA.set(pos, 0);
      mA.set(value, 0);
      return true;
    }

    // Check mA(value) = pos
    final long r = mA.get(value - 1);
    final long dr = pos - r;
    if (r != 0) {
      if (mDiffs.contains(dr)) {
        mA.set(pos, 0);
        mA.set(value, 0);
        return false; // Left difference already occurred
      }
    }
    final long s = mA.get(value + 1);
    final long ds = s - pos;
    if (s != 0) {
      if (mDiffs.contains(ds)) {
        mA.set(pos, 0);
        mA.set(value, 0);
        return false; // Right difference already occurred
      }
    }
    // These next two conditions appear to be redundant
//    if (r != 0 && value != pos + 1 && (dr == dp || (q != 0 && dr == dq))) {
//      mA.set(pos, 0);
//      mA.set(value, 0);
//      return false; // Would cause a repeated difference
//    }
//    if (s != 0 && (ds == dp || (q != 0 && ds == dq) || (r != 0 && ds == dr))) {
//      mA.set(pos, 0);
//      mA.set(value, 0);
//      return false; // Would cause a repeated difference
//    }
    mA.set(pos, 0);
    mA.set(value, 0);
    return true;
  }

  private void place(final long pos, final long value) {
    mA.set(pos, value);
    mA.set(value, pos);
    mDiffs.add(value - mA.get(pos - 1));
    if (mA.get(pos + 1) != 0) {
      mDiffs.add(mA.get(pos + 1) - value);
    }
    if (mA.get(value - 1) != 0) {
      mDiffs.add(pos - mA.get(value - 1));
    }
    if (mA.get(value + 1) != 0) {
      mDiffs.add(mA.get(value + 1) - pos);
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mA.get(mN) != 0) {
      final long r = mA.get(mN);
      mDiffs.add(r - mA.get(mN - 1));
      return Z.valueOf(r);
    }
    long k = mN;
    while (true) {
      if (canPlace(mN, k)) {
        place(mN, k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

