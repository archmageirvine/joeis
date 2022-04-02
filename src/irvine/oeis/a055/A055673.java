package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a001.A001132;
import irvine.oeis.a003.A003629;

/**
 * A055673 Absolute values of norms of primes in ring of integers Z[sqrt(2)].
 * @author Sean A. Irvine
 */
public class A055673 extends UnionSequence {

  /** Construct the sequence. */
  public A055673() {
    super(new PrependSequence(new A001132(), 2), new A003629() {
      @Override
      public Z next() {
        return super.next().square();
      }
    });
  }
}
