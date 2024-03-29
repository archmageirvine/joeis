package irvine.oeis.a262;
// Generated by gen_seq4.pl genet at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A262928 Expansion of Product_{k&gt;=0} (1 + x^(3*k+2)).
 * G.f.: <code>Product_{k&gt;=0} ((1+x^(3*k+2)))</code>
 * @author Georg Fischer
 */
public class A262928 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A262928() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(3 * k + 2);
  }

}
