package irvine.oeis.a276;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000849;

/**
 * A276497 Maximum number of different possible residues of the division of prime(k) by primorial(n), with k such that prime(k) &gt; primorial(n).
 * @author Georg Fischer
 */
public class A276497 extends AbstractSequence {

  private A000849 mSeq1 = new A000849();
  private long mN;

  /** Construct the sequence. */
  public A276497() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(mN - 1);
  }
}
