package irvine.oeis.a070;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A070000 Let B(n) denote the number of distinct norms &lt;=n in the square lattice and let B_3(n) denote the number of distinct norms &lt;=n in the hexagonal lattice; sequence gives B(n) - B3(n).
 * @author Sean A. Irvine
 */
public class A070000 extends Sequence0 {

  private static long squareNorm(final Pair<Integer, Integer> p) {
    return (long) p.left() * p.left() + (long) p.right() * p.right();
  }

  private static long hexagonalNorm(final Pair<Integer, Integer> p) {
    return (long) p.left() * p.left() + 3L * p.right() * p.right();
  }

  private final TreeSet<Pair<Integer, Integer>> mSquare = new TreeSet<>(Comparator.comparingLong(A070000::squareNorm).thenComparingInt(Pair::left).thenComparingInt(Pair::right));
  private final TreeSet<Pair<Integer, Integer>> mHexagonal = new TreeSet<>(Comparator.comparingLong(A070000::hexagonalNorm).thenComparingInt(Pair::left).thenComparingInt(Pair::right));
  private long mCount = 0;
  private long mN = -1;
  {
    mSquare.add(new Pair<>(0, 0));
    mHexagonal.add(new Pair<>(0, 0));
    next();
  }

  @Override
  public Z next() {
    ++mN;
    if (squareNorm(mSquare.first()) == mN) {
      ++mCount;
      do {
        final Pair<Integer, Integer> p = mSquare.pollFirst();
        mSquare.add(new Pair<>(p.left() + 1, p.right()));
        mSquare.add(new Pair<>(p.left(), p.right() + 1));
      } while (squareNorm(mSquare.first()) == mN);
    }
    if (hexagonalNorm(mHexagonal.first()) == mN) {
      --mCount;
      do {
        final Pair<Integer, Integer> p = mHexagonal.pollFirst();
        mHexagonal.add(new Pair<>(p.left() + 1, p.right()));
        mHexagonal.add(new Pair<>(p.left(), p.right() + 1));
      } while (hexagonalNorm(mHexagonal.first()) == mN);
    }
    return Z.valueOf(mCount);
  }
}
