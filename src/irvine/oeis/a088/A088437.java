package irvine.oeis.a088;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003053;

/**
 * A088437 Number of n X n orthogonal matrices over GF(2) modulo permutations of rows.
 * @author Georg Fischer
 */
public class A088437 extends AbstractSequence {

  private final A003053 mSeq1 = new A003053();
  private int mN;

  /** Construct the sequence. */
  public A088437() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    final int n = ++mN;
    return mSeq1.next().divide(Functions.FACTORIAL.z(n));
  }
}
