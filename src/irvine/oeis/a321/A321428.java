package irvine.oeis.a321;
// Generated by gen_seq4.pl genet/genetfg at 2022-02-20 20:24

import irvine.math.z.Z;
import irvine.oeis.a063.A063725;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A321428 Expansion of Product_{i&gt;0, j&gt;0} (1 + x^(i^2 + j^2)).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A063725(k))</code>
 * @author Georg Fischer
 */
public class A321428 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A321428() {
    super(0, 1);
    mSeqF = new A063725();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {mSeqF.next().negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
