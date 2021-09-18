package irvine.oeis.a051;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051567 Consider problem of placing N queens on an n X n board so that each queen attacks precisely k others. Here k=1 and sequence gives number of inequivalent solutions when N is equal to the upper bound 2*floor(2n/3).
 * @author Sean A. Irvine
 */
public class A051567 extends A019654 {

  @Override
  protected void search(final int[] attacks, final int queen, final int x, final int y, final int remaining) {
    if (y >= mSize) {
      // Search is done
      if (queen == mMaximalQueens && isExact(attacks)) {
        if (isCanonical(attacks)) {
          ++mMaximalCount;
        }
      }
      return;
    }
    if (remaining < mMaximalQueens - queen) {
      return; // Insufficient remaining squares to achieve current best
    }
    if (x >= mSize) {
      // Move to next row
      search(attacks, queen, 0, y + 1, remaining);
      return;
    }
    // Consider placing at queen at (x,y)
    if (pop(attacks, x, y) <= mExactAttack) {
      final int[] newBits = Arrays.copyOf(attacks, attacks.length);
      // Mark all consequences by expanding in all 8 directions from (x,y)
      or(newBits, x, y, QUEEN_BIT);
      if (markAndCheck(newBits, x, y, 1, 0, 1)
        && markAndCheck(newBits, x, y, -1, 0, 2)
        && markAndCheck(newBits, x, y, 0, 1, 4)
        && markAndCheck(newBits, x, y, 0, -1, 8)
        && markAndCheck(newBits, x, y, 1, 1, 16)
        && markAndCheck(newBits, x, y, 1, -1, 32)
        && markAndCheck(newBits, x, y, -1, 1, 64)
        && markAndCheck(newBits, x, y, -1, -1, 128)) {
        // Placement looks ok, try another queen
        search(newBits, queen + 1, x + 1, y, remaining - 1);
      }
    }
    search(attacks, queen, x + 1, y, remaining - 1);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(solve(++mN, 2 * (2 * mN / 3), 1));
  }
}
