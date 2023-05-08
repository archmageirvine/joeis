package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058870;

/**
 * A063687 Number of 2-trees rooted at any symmetric edge.
 * @author Sean A. Irvine
 */
public class A063689 extends A063687 {

  private int mN = -1;
  private final Sequence mXSeq = new A058870();

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN > 0 ? mXSeq.next() : Z.ZERO);
  }
}

