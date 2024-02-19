package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a054.A054440;

/**
 * A260669 Number of unordered pairs of partitions of n with no common parts.
 * @author Georg Fischer
 */
public class A260669 extends Sequence0 {

  private final Sequence mSeq1 = new PrependSequence(new A054440().skip(), 2);

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
