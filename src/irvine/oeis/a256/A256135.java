package irvine.oeis.a256;
// Generated by gen_seq4.pl genet at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A256135 a(n) = 5^A000120(n).
 * G.f.: <code>Product_{k&gt;=0} ((1+5*x^(2^k)))</code>
 * @author Georg Fischer
 */
public class A256135 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A256135() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.FIVE.negate();
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.TWO.pow(k);
  }

}
