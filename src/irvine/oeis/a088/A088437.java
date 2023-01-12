package irvine.oeis.a088;
// manually andiv 

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003053;

/**
 * A088437 Number of n X n orthogonal matrices over GF(2) modulo permutations of rows.
 * @author Georg Fischer
 */
public class A088437 extends AbstractSequence {

  private A003053 mSeq1 = new A003053();
  private int mN;

  /** Construct the sequence. */
  public A088437() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(MemoryFactorial.SINGLETON.factorial(++mN));
  }
}
