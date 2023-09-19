package irvine.oeis.a176;
// manually morfps at 2023-09-14

import irvine.math.z.Z;
import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A176416 Fixed point of morphism 0-&gt;0PPMM00, P-&gt;0PPMM0P, M=0PPMM0M (where P=+1, M=-1).
 * @author Georg Fischer
 */
public class A176416 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A176416() {
    super(0, "0", "0112", "0->0112200, 1->0112201,2->0112202");
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return result.equals(Z.TWO) ? Z.NEG_ONE : result;
  }
}
