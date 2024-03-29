package irvine.oeis.a189;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
/**
 * A189681 (A189676)/2; from a 3-way partition of the positive integers.
 * @author Georg Fischer
 */
public class A189681 extends Sequence1 {

  private final Sequence mA189676 = new A189676();
  @Override
  public Z next() {
    return mA189676.next().divide(Z.TWO);
  }

}
