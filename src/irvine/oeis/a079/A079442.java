package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014137;
import irvine.oeis.a071.A071663;

/**
 * A079442 Number of fixed points in range [A014137(n-1)..A014138(n)] of permutation A071663.
 * @author Sean A. Irvine
 */
public class A079442 extends A014137 {

  private final Sequence mSeq;
  private int mM = 0;

  protected A079442(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A079442() {
    this(new A071663());
  }

  @Override
  public Z next() {
    final int limit = super.next().intValueExact();
    int cnt = 0;
    while (mM < limit) {
      if (mSeq.next().intValueExact() == mM) {
        ++cnt;
      }
      ++mM;
    }
    return Z.valueOf(cnt);
  }
}
