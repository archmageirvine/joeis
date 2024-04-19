package irvine.oeis.a321;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005130;

/**
 * A321511 Number of alternating sign n X n matrices excluding permutation matrices.
 * @author Georg Fischer
 */
public class A321511 extends AbstractSequence {

  private final A005130 mSeq1 = new A005130();
  private int mN;

  /** Construct the sequence. */
  public A321511() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    final int n = ++mN;
    return mSeq1.next().subtract(Functions.FACTORIAL.z(n));
  }
}
