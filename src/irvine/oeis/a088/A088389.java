package irvine.oeis.a088;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055165;

/**
 * A088389 Number of real regular n X n (0,1) matrices modulo rows permutations.
 * @author Georg Fischer
 */
public class A088389 extends AbstractSequence {

  private final A055165 mSeq1 = new A055165();
  private int mN;

  /** Construct the sequence. */
  public A088389() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(Functions.FACTORIAL.z(++mN));
  }
}
