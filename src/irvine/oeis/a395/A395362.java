package irvine.oeis.a395;

import java.util.HashSet;

import irvine.math.HexSpiral;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395362 Walk along the hexagonal spiral, with its cells numbered starting at 0. Begin with no knights. If the square you are at is not attacked by an existing knight, place a knight there, otherwise leave it empty. The sequence lists the squares occupied by the knights.
 * @author Sean A. Irvine
 */
public class A395362 extends Sequence0 {

  private static final int[][] KNIGHT_ATTACKS = {
    {2, 1},
    {3, -1},

    {1, 2},
    {-1, 3},

    {-2, 3},
    {-3, 2},

    {-3, 1},
    {-2, -1},

    {-1, -2},
    {1, -3},

    {2, -3},
    {3, -2}
  };

  private final HashSet<Long> mForbidden = new HashSet<>();
  private final HexSpiral mSpiral = new HexSpiral();
  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final long pos = mSpiral.next();
      if (!mForbidden.contains(pos)) {
        final int q = HexSpiral.q(pos);
        final int r = HexSpiral.r(pos);
        for (int[] k : KNIGHT_ATTACKS) {
          final long pt = HexSpiral.pack(q + k[0], r + k[1]);
          mForbidden.add(pt);
        }
        return Z.valueOf(mM);
      }
    }
  }
}
