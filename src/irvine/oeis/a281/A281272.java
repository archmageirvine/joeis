package irvine.oeis.a281;
// Generated by gen_seq4.pl genet at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A281272 Expansion of Product_{k&gt;=1} (1 + x^(5*k-3)).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^(5*k-3)))</code>
 * @author Georg Fischer
 */
public class A281272 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A281272() {
    super(0, 1);
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
    return Z.valueOf(5 * k - 3);
  }

}
