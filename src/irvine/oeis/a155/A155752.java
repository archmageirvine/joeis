package irvine.oeis.a155;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a029.A029707;

/**
 * A155752 Where 2's occur in the prime differences A001223.
 * @author Georg Fischer
 */
public class A155752 extends Sequence1 {

  final Sequence mA029707 = new A029707();
  @Override
  public Z next() {
    return mA029707.next().subtract(Z.ONE);
  }

}
