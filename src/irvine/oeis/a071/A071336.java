package irvine.oeis.a071;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003136;

/**
 * A071336 Number of vertices of Goldberg-Casper-Klug pseudo-icosahedra.
 * @author Georg Fischer
 */
public class A071336 extends Sequence1 {

  final Sequence mA003136 = new A003136();
  /** Construct the sequence. */
  public A071336() {
    mA003136.next();
  }
  
  @Override
  public Z next() {
    return Z.TEN.multiply(mA003136.next()).add(Z.TWO);
  }

}
