package irvine.oeis.a070;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a059.A059169;

/**
 * A070106
 * @author Georg Fischer
 */
public class A070106 extends AbstractSequence {

  private A059169 mSeq1 = new A059169();
  private A070098 mSeq2 = new A070098();

  /** Construct the sequence. */
  public A070106() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
