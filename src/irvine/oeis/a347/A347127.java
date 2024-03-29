package irvine.oeis.a347;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003557;
import irvine.oeis.a327.A327251;
/**
 * A347127 a(n) = A327251(n) / A003557(n).
 * @author Georg Fischer
 */
public class A347127 extends Sequence1 {

  private final Sequence mA003557 = new A003557();
  private final Sequence mA327251 = new A327251();
  @Override
  public Z next() {
    return mA327251.next().divide(mA003557.next());
  }

}
