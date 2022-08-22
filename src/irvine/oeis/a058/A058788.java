package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058788 Triangle T(n,k) = number of polyhedra (triconnected planar graphs) with n edges and k vertices (or k faces), where (n/3+2) &lt;= k &lt;= (2n/3). Note that there is no such k when n=7.
 * @author Sean A. Irvine
 */
public class A058788 implements Sequence {

  private int mN = 5;
  private int mM = 10;
  private final List<long[]> mEdgeCounts = new ArrayList<>();
  {
    mEdgeCounts.add(new long[0]);
  }

  private long t(final int edges, final int vertices) {
    while (vertices >= mEdgeCounts.size()) {
      final Plantri plantri = new Plantri();
      plantri.count(vertices, -1, -1, -1, false, true, false, false);
      mEdgeCounts.add(plantri.getEdgeCounts());
    }
    return mEdgeCounts.get(vertices)[edges];
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN / 3) {
      if (++mN == 7) {
        ++mN;
      }
      mM = (mN + 2) / 3 + 2;
    }
    return Z.valueOf(t(mN, mM));
  }
}

