package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001372;
import irvine.oeis.a002.A002861;

/**
 * A127912 Number of nonisomorphic disconnected mappings (or mapping patterns) from n points to themselves; number of disconnected endofunctions.
 * @author Georg Fischer
 */
public class A127912 extends Sequence0 {

  private final Sequence mSeq1 = new A001372().skip();
  private final Sequence mSeq2 = new A002861().skip();

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
