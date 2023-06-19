package irvine.oeis.a304;
// manually 2022-12-26

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.SkipSequence;
import irvine.oeis.a035.A035053;

/**
 * A304970 Number of unlabeled hypertrees with up to n vertices and without singleton edges.
 * @author Georg Fischer
 */
public class A304970 extends Sequence0 {

  private final PrependSequence mSeq = new PrependSequence(new PartialSumSequence(0, new SkipSequence(new A035053(), 1)), 1);

  @Override
  public Z next() {
    return mSeq.next();
  }
}
