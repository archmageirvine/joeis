package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058870;

/**
 * A063689 Number of 2-trees rooted at a triangle with 3 similar edges.
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

