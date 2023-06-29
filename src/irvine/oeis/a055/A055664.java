package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002476;
import irvine.oeis.a003.A003627;

/**
 * A055664 Norms of Eisenstein-Jacobi primes.
 * @author Sean A. Irvine
 */
public class A055664 extends PrependSequence {

  /** Construct the sequence. */
  public A055664() {
    super(1, new UnionSequence(new A002476(), new A003627() {
      @Override
      public Z next() {
        return super.next().square();
      }
    }), 3);
  }
}
