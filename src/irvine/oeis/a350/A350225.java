package irvine.oeis.a350;
// manually andiv 

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000712;

/**
 * A350225 Number of ordered pairs (a,g) with a in IS_n the symmetric inverse semigroup on [n] and g in symmetric group on [n] such that ag=ga.
 * @author Georg Fischer
 */
public class A350225 extends AbstractSequence {

  private A000712 mSeq1 = new A000712();
  private int mN;

  /** Construct the sequence. */
  public A350225() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(MemoryFactorial.SINGLETON.factorial(++mN));
  }
}
