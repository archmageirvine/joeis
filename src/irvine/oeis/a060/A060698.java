package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a053.A053767;

/**
 * A060698 The sum of the first n composite numbers minus 1 is a prime.
 * @author Sean A. Irvine
 */
public class A060698 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A060698() {
    super(1, 0, new A053767() {
      @Override
      public Z next() {
        return super.next().subtract(1);
      }
    }, PRIME);
  }
}
