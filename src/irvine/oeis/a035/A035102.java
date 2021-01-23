package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000108;

/**
 * A035102 Composite binary rooted trees with external nodes.
 * @author Sean A. Irvine
 */
public class A035102 extends A035010 {

  private final Sequence mCatalan = new SkipSequence(new A000108(), 1);

  @Override
  public Z next() {
    return mCatalan.next().subtract(super.next());
  }
}
