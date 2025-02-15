package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicIntArray;

/**
 * A075273 Related to the game Blet.
 * @author Sean A. Irvine
 */
public class A075273 extends Sequence2 {

  // Encode heads = 0, tails = 1

  private int mN = 2;
  private final Set<Z> mSeen = new HashSet<>();

  private void search(final Z state) {
    final DynamicArray<Z> stack = new DynamicArray<>();
    final DynamicIntArray ks = new DynamicIntArray();
    stack.set(0, state);
    ks.set(0, -1);
    int pos = 0;
    outer:
    while (pos >= 0) {
      final Z s = stack.get(pos);
      int k = ks.get(pos);
      while (++k < mN) {
        final int bits = (s.testBit((k + 2) % mN) ? 4 : 0)
          + (s.testBit((k + 1) % mN) ? 2 : 0)
          + (s.testBit(k) ? 1 : 0);
        if (bits == 5 || bits == 2) {
          final Z next = s.flipBit(k).flipBit((k + 1) % mN).flipBit((k + 2) % mN); // not very efficient
          if (mSeen.add(next)) {
            ks.set(pos, k);
            ++pos;
            stack.set(pos, next);
            ks.set(pos, -1);
            continue outer;
          }
        }
      }
      --pos;
    }
  }

  @Override
  public Z next() {
    mN += 2; // total number of coins
    mSeen.clear();
    final Z start = new Z("01".repeat(mN / 2), 2);
    mSeen.add(start);
    search(start);
    return Z.valueOf(mSeen.size());
  }
}
