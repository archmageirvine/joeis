package irvine.oeis.a051;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051802 Nonzero multiplicative digital root of n. 
 * @author Georg Fischer
 */
public class A051802 extends Sequence0 {

  protected long mN; // current index
  
  /** Construct the sequence. */
  public A051802() {
    mN = -1;
  }

  @Override
  public Z next() {
    final Z v = Z.valueOf(++mN);
    return Functions.DIGIT_NZ_PRODUCT_ROOT.z(v);
  }
}
