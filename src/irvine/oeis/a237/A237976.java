package irvine.oeis.a237;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000009;
import irvine.oeis.a025.A025157;

/**
 * A237976 Number of strict partitions of n such that (least part) &lt; number of parts.
 * @author Georg Fischer
 */
public class A237976 extends Sequence0 {

  private final A000009 mSeq1 = new A000009();
  private final A025157 mSeq2 = new A025157();

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
