package irvine.oeis.a344;
// manually 2021-06-15

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;
import irvine.oeis.a001.A001147;
import irvine.oeis.memory.MemorySequence;

/**
 * A344852 Number of rooted binary trees with n leaves with minimal Symmetry Nodes Index (SNI) or, equivalently, with the maximal number of symmetry nodes.
 * @author Georg Fischer
 */
public class A344852 extends A000120 {

  protected MemorySequence mSeqDF;

  /** Construct the sequence. */
  public A344852() {
    super(1);
    mSeqDF = MemorySequence.cachedSequence(new A001147()); // double factorials of odd numbers
    super.next(); // skip A000120(0)
  }

  @Override
  public Z next() {
    return mSeqDF.a(super.next().intValue() - 1);
  }
}
