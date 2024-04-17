package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000207 Number of inequivalent ways of dissecting a regular (n+2)-gon into n triangles by n-1 non-intersecting diagonals under rotations and reflections; also the number of (unlabeled) maximal outerplanar graphs on n+2 vertices.
 * @author Sean A. Irvine
 */
public class A000207 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000207(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000207() {
    super(1);
  }

  private int mN = 0;
  private final ArrayList<Z> mC = new ArrayList<>();
  private final A000108 mA108 = new A000108();

  {
    mC.add(mA108.next());
  }

  private Z c(final int n) {
    return mC.get(n);
  }

  @Override
  public Z next() {
    mC.add(mA108.next());
    ++mN;
    final int k = (mN & 1) == 0 ? mN / 2 + 2 : (mN + 3) / 2;
    Q r = new Q(c(mN), 2L * mN + 4).add(new Q(c(k - 2), Z.TWO));
    if ((mN & 1) == 0) {
      r = r.add(new Q(c(mN / 2), Z.FOUR));
    }
    if ((mN + 2) % 3 == 0) {
      r = r.add(new Q(c((mN - 1) / 3), Z.THREE));
    }
    assert r.isInteger();
    return r.toZ();
  }
}

