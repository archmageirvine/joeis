package irvine.oeis.a058;
// Generated by gen_seq4.pl genet/genetf at 2022-02-20 20:24

import irvine.math.z.Z;
import irvine.oeis.a000.A000084;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A058499 G.f.: Product_{j&gt;=1} (1 - x^j)^(-A000084(j)).
 * G.f.: <code>Product_{k&gt;=1} ((1-x^k)^(-A000084(k)))</code>
 * @author Georg Fischer
 */
public class A058499 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A058499() {
    super(0, 1);
    mSeqF = new A000084();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {mSeqF.next()};
  }

}
