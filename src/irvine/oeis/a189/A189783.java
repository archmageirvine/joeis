package irvine.oeis.a189;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
/**
 * A189783 (A189781)/2.
 * @author Georg Fischer
 */
public class A189783 extends Sequence1 {

  private final Sequence mA189781 = new A189781();
  @Override
  public Z next() {
    return mA189781.next().divide(Z.TWO);
  }

}
