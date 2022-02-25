package irvine.oeis.a060;
// manually (decexp) at 2021-07-13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060708 The Reuleaux Triangle constant.
 * @author Georg Fischer
 */
public class A060708 extends DecimalExpansionSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A060708() {
    super(1, CR.PI.subtract(CR.THREE.sqrt()).divide(CR.TWO), 10);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return super.next();
  }
}
