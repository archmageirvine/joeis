package irvine.oeis.a176;
// manually partsum at 2021-09-13 21:35

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001168;
/**
 * A176673 Partial sums of A001168.
 * @author Georg Fischer
 */
public class A176673 extends PartialSumSequence {

  /** Construct the sequence. */
  public A176673() {
    super(new A001168());
    super.next();
  }
  
  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}
