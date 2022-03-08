package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002145;

/**
 * A055025 Norms of Gaussian primes.
 * @author Sean A. Irvine
 */
public class A055025 extends UnionSequence {

  /** Construct the sequence. */
  public A055025() {
    super(new PrependSequence(new A002144(), 2), new A002145() {
      @Override
      public Z next() {
        return super.next().square();
      }
    });
  }
}
