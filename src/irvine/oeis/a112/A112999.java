package irvine.oeis.a112;
// manually 2021-06-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a036.A036740;

/**
 * A112999 Partial sums of A036740.
 * @author Georg Fischer
 */
public class A112999 extends PartialSumSequence {

  /** Construct the sequence. */
  public A112999() {
    super(1, new A036740());
    super.next();
  }
  
  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}
