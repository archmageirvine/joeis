package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedSequence;

/**
 * A056746 Raw solutions to Hi-Q puzzle with n holes on a side, any initial peg removed.
 * @author Sean A. Irvine
 */
public class A056746 extends Sequence1 implements UnimplementedSequence {

//  private static final int[] DELTAX = {-1, 1, 0, 0};
//  private static final int[] DELTAY = {0, 0, -1, 1};
//  private int mN = 0;
//  private long mCount = 0;
//  private boolean[][] mBoard = null;
//
//  private boolean isOnBoard(final int x, final int y) {
////    if (x == 0 && y == 0) {
////      return false;
////    }
////    if (x == 0 && y == mN - 1) {
////      return false;
////    }
////    if (x == mN - 1 && y == mN - 1) {
////      return false;
////    }
////    if (x == mN - 1 && y == 0) {
////      return false;
////    }
//    return x >= 0 && y >= 0 && x < mN && y < mN;
//  }
//
//  private void search(final int remaining) {
//    if (remaining == 1) {
//      ++mCount;
//      return;
//    }
//    for (int y = 0; y < mN; ++y) {
//      for (int x = 0; x < mN; ++x) {
//        if (isOnBoard(x, y) && !mBoard[y][x]) {
//          for (int d = 0; d < DELTAX.length; ++d) {
//            final int ny = y + DELTAY[d];
//            final int nx = x + DELTAX[d];
//            if (isOnBoard(nx, ny) && !mBoard[ny][nx]) {
//              final int ty = ny + DELTAY[d];
//              final int tx = nx + DELTAX[d];
//              if (isOnBoard(tx, ty) && mBoard[ty][tx]) {
//                // We can jump (x,y) over (nx,ny) to empty space at (tx,ty)
//                mBoard[ty][tx] = false;
//                mBoard[ny][nx] = true;
//                mBoard[y][x] = true;
//                search(remaining - 1);
//                mBoard[y][x] = false;
//                mBoard[ny][nx] = false;
//                mBoard[ty][tx] = true;
//              }
//            }
//          }
//        }
//      }
//    }
//  }
//
//  @Override
//  public Z next() {
//    mBoard = new boolean[++mN][mN];
//    mCount = 0;
//    for (int y = 0; y < mN; ++y) {
//      for (int x = 0; x < mN; ++x) {
//        if (isOnBoard(x, y)) {
//          mBoard[y][x] = true;
//          search(mN * mN - 1);
//          mBoard[y][x] = false;
//        }
//      }
//    }
//    return Z.valueOf(mCount);
//  }

  @Override
  public Z next() {
    return null;
  }
}
