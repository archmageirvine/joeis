package irvine.oeis.a001;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001997 Number of different shapes formed by bending a piece of wire of length n in the plane.
 * @author Sean A. Irvine
 */
public class A001997 implements Sequence {

  private HashSet<String> mWire = null;

  private String rotate(final String wire) {
    final StringBuilder sb = new StringBuilder(wire.length());
    for (int k = 0; k < wire.length(); ++k) {
      final char c = wire.charAt(k);
      if (c == 'L') {
        sb.append('R');
      } else if (c == 'R') {
        sb.append('L');
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  private String key(final int x0, final int y0, final int x1, final int y1) {
    if (x0 < x1) {
      return x0 + "_" + y0 + "_" + x1 + "_" + y1;
    } else if (x1 < x0) {
      return x1 + "_" + y1 + "_" + x0 + "_" + y0;
    }
    if (y0 < y1) {
      return x0 + "_" + y0 + "_" + x1 + "_" + y1;
    } else {
      return x1 + "_" + y1 + "_" + x0 + "_" + y0;
    }
  }

  // Reused to avoid churn
  private final HashSet<String> mSeen = new HashSet<>();

  private boolean checkIntersection(final String wire) {
    if (wire.startsWith("LLLL") || wire.startsWith("RRRR") || wire.endsWith("LLLL") || wire.endsWith("RRRR")) {
      // These are some common cases of overlaps
      return true;
    }
    int dx = 1;
    int dy = 0;
    int x = 1;
    int y = 0;
    mSeen.clear();
    mSeen.add("0_0_1_0");
    for (int k = 0; k < wire.length(); ++k) {
      final char c = wire.charAt(k);
      if (c == 'L') {
        if (dx != 0) {
          dy = dx;
          dx = 0;
        } else {
          dx = -dy;
          dy = 0;
        }
      } else if (c == 'R') {
        if (dx != 0) {
          dy = -dx;
          dx = 0;
        } else {
          dx = dy;
          dy = 0;
        }
      }
      final int nx = x + dx;
      final int ny = y + dy;
      if (!mSeen.add(key(x, y, nx, ny))) {
        return true;
      }
      x = nx;
      y = ny;
    }
    return false;
  }

  private void addIfPossible(final Set<String> set, final String wire) {
    if (!set.contains(wire) && !set.contains(new StringBuilder(wire).reverse().toString())) {
      final String rot = rotate(wire);
      if (!set.contains(rot) && !set.contains(new StringBuilder(rot).reverse().toString())) {
        if (!checkIntersection(wire)) {
          set.add(wire);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (mWire == null) {
      mWire = new HashSet<>();
      return Z.ONE;
    }
    if (mWire.isEmpty()) {
      mWire.add("");
    } else {
      final HashSet<String> newSeq = new HashSet<>();
      for (final String w : mWire) {
        addIfPossible(newSeq, w + "0");
        addIfPossible(newSeq, w + "L");
        addIfPossible(newSeq, w + "R");
        addIfPossible(newSeq, "0" + w);
        addIfPossible(newSeq, "L" + w);
        addIfPossible(newSeq, "R" + w);
      }
      mWire = newSeq;
    }
    return Z.valueOf(mWire.size());
  }
}
