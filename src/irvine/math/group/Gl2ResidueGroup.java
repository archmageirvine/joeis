package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

/**
 * Packed matrices in GL(2,Z_n), used for exact small-group enumeration.
 * @author Gregory Morse
 */
final class Gl2ResidueGroup {

  private final int mMod;
  private final int mSquare;
  private final int mCube;
  private final int[] mInverses;
  private final List<Integer> mElements = new ArrayList<>();

  Gl2ResidueGroup(final int modulus) {
    mMod = modulus;
    mSquare = Math.multiplyExact(modulus, modulus);
    mCube = Math.multiplyExact(mSquare, modulus);
    mInverses = new int[Math.multiplyExact(mCube, modulus)];
    final int[] units = new int[modulus];
    for (int i = 1; i < modulus; ++i) {
      for (int j = 1; j < modulus; ++j) {
        if ((long) i * j % modulus == 1) {
          units[i] = j;
          break;
        }
      }
    }
    for (int x = 0; x < mInverses.length; ++x) {
      final int a = x / mCube;
      final int b = x / mSquare % mMod;
      final int c = x / mMod % mMod;
      final int d = x % mMod;
      final int u = units[Math.floorMod(a * d - b * c, mMod)];
      if (u != 0) {
        mElements.add(x);
        mInverses[x] = encode(d * u, -b * u, -c * u, a * u);
      }
    }
  }

  private int encode(final int a, final int b, final int c, final int d) {
    return Math.floorMod(a, mMod) * mCube + Math.floorMod(b, mMod) * mSquare
      + Math.floorMod(c, mMod) * mMod + Math.floorMod(d, mMod);
  }

  int identity() {
    return encode(1, 0, 0, 1);
  }

  int bound() {
    return mInverses.length;
  }

  List<Integer> elements() {
    return mElements;
  }

  int inverse(final int x) {
    return mInverses[x];
  }

  int multiply(final int x, final int y) {
    final int a = x / mCube;
    final int b = x / mSquare % mMod;
    final int c = x / mMod % mMod;
    final int d = x % mMod;
    final int e = y / mCube;
    final int f = y / mSquare % mMod;
    final int g = y / mMod % mMod;
    final int h = y % mMod;
    return encode(a * e + b * g, a * f + b * h, c * e + d * g, c * f + d * h);
  }
}
