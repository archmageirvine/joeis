package irvine.oeis.a290;
// Generated by gen_seq4.pl genet/genetf at 2022-02-20 20:24

import irvine.math.z.Z;
import irvine.oeis.a007.A007714;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A290355 The sixth Euler transform of the sequence with g.f. 1+x.
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^A007714(k))</code>
 * @author Georg Fischer
 */
public class A290355 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A290355() {
    super(0, 1);
    mSeqF = new A007714();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {mSeqF.next()};
  }

}
