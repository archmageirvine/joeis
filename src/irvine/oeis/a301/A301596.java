package irvine.oeis.a301;
// Generated by gen_seq4.pl genet/genetfg at 2022-02-20 20:24

import irvine.math.z.Z;
import irvine.oeis.a050.A050985;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A301596 Expansion of Product_{k&gt;=1} (1 + x^k)^A050985(k).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A050985(k))</code>
 * @author Georg Fischer
 */
public class A301596 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A301596() {
    super(0, 1);
    mSeqF = new A050985();
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
