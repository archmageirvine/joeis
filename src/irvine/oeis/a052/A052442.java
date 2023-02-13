package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001349;
import irvine.oeis.a002.A002218;

/**
 * A052442 Number of simple unlabeled n-node graphs of connectivity 1.
 * @author Sean A. Irvine
 */
public class A052442 extends A001349 {

  private final Sequence mA = new PrependSequence(new SkipSequence(new A002218(), 2), 1, 0);

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
