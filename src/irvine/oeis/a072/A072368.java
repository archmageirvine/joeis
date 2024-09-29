package irvine.oeis.a072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072368 Minimal total volume of n bricks with integer sides, all sides being different. Lowest value of sum of products of triples p*q*r chosen from [1,3n].
 * @author Sean A. Irvine
 */
public class A072368 extends Sequence1 {

  // Too slow to be useful
  // Much better linear programming solutions exist

  private static final class Brick implements Comparable<Brick> {
    private final int mX;
    private final int mY;
    private final int mZ;
    private final int mVolume;

    private Brick(final int x, final int y, final int z) {
      mX = x;
      mY = y;
      mZ = z;
      mVolume = x * y * z;
    }

    private boolean isCompatible(final Brick other) {
      return mZ != other.mZ
        && mZ != other.mY
        && mZ != other.mX
        && mY != other.mZ
        && mY != other.mY
        && mY != other.mX
        && mX != other.mZ
        && mX != other.mY
        && mX != other.mX;
    }

    private boolean isCompatible(final Brick[] bricks, final int n) {
      for (int k = 0; k < n; ++k) {
        if (!isCompatible(bricks[k])) {
          return false;
        }
      }
      return true;
    }

    @Override
    public int compareTo(final Brick brick) {
      final int vol = Integer.compare(mVolume, brick.mVolume);
      if (vol != 0) {
        return vol;
      }
      final int z = Integer.compare(mZ, brick.mZ);
      if (z != 0) {
        return z;
      }
      final int y = Integer.compare(mY, brick.mY);
      if (y != 0) {
        return y;
      }
      return Integer.compare(mX, brick.mX);
    }

    @Override
    public int hashCode() {
      return mVolume;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Brick)) {
        return false;
      }
      final Brick other = (Brick) obj;
      return mVolume == other.mVolume && mZ == other.mZ && mY == other.mY && mX == other.mX;
    }
  }

  private int mN = 0;
  private final List<Brick> mBricks = new ArrayList<>();
  private int mMin = 0;

  private void search(final Brick[] bricks, final int pos, final int k, final int volume) {
    if (pos == mN) {
      mMin = volume;
      return;
    }
    for (int j = k; j < mBricks.size(); ++j) {
      final Brick b = mBricks.get(j);
      final int v = volume + b.mVolume;
      if (v >= mMin) {
        break;
      }
      if (b.isCompatible(bricks, pos)) {
        bricks[pos] = b;
        search(bricks, pos + 1, j + 1, v);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBricks.clear();
    mMin = Integer.MAX_VALUE;
    for (int x = 1; x < 3 * mN; ++x) {
      for (int y = x + 1; y < 3 * mN; ++y) {
        for (int z = y + 1; z <= 3 * mN; ++z) {
          mBricks.add(new Brick(x, y, z));
        }
      }
    }
    Collections.sort(mBricks);
    search(new Brick[mN], 0, 0, 0);
    return Z.valueOf(mMin);
  }
}
