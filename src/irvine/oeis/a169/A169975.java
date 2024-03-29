package irvine.oeis.a169;
// Generated by gen_seq4.pl genet at 2022-02-20 20:24

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A169975 Expansion of Product_{i&gt;=0} (1 + x^(4*i+1)).
 * G.f.: <code>Product_{k&gt;=0} ((1+x^(4*k+1)))</code>
 * @author Georg Fischer
 */
public class A169975 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A169975() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(4 * k + 1);
  }

}
