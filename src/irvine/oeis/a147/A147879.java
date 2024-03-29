package irvine.oeis.a147;
// Generated by gen_seq4.pl genet/genetfg at 2022-02-20 20:24

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A147879 Expansion of Product_{k&gt;=1} (1 + x^k*A005185(k)).
 * G.f.: <code>Product_{k&gt;=1} ((1+A005185(k)*x^k))</code>
 * @author Georg Fischer
 */
public class A147879 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A147879() {
    super(0, 1);
    mSeqG = new A005185();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return mSeqG.next().negate();
  }

}
