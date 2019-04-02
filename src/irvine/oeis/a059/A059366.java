package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000142;
import irvine.oeis.a000.A000984;

import java.util.ArrayList;

/**
 * A059366 Triangle T(m,s), m &gt;= 0, 0 &lt;= s &lt;= m, arising in computation of certain integrals.
 * @author Sean A. Irvine
 */
public class A059366 implements Sequence {

  private final A000984 mA0984 = new A000984();
  private final A000142 mA0142 = new A000142();
  private final A000079 mA0079 = new A000079();
  private final ArrayList<Z> mSeq984 = new ArrayList<>();
  private final ArrayList<Z> mSeq142 = new ArrayList<>();
  private final ArrayList<Z> mSeq79 = new ArrayList<>();

  protected Z t(final int n, final int s) {
    while (n >= mSeq984.size()) {
      mSeq984.add(mA0984.next());
      mSeq142.add(mA0142.next());
      mSeq79.add(mA0079.next());
    }
    return mSeq984.get(s).multiply(mSeq984.get(n - s)).multiply(mSeq142.get(n)).divide(mSeq79.get(n));
  }

  private int mN = -1;
  private int mS = 0;

  @Override
  public Z next() {
    if (++mS > mN) {
      ++mN;
      mS = 0;
    }
    return t(mN, mS);
  }
}

