package irvine.oeis.a390;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.Sequence1;

/**
 * A390223 Numbers k such that for the k-th almost-equilateral Heronian triangle (triangle with consecutive integer sides and integer area), perimeter - inradius is a prime or semiprime.
 * @author Sean A. Irvine
 */
public class A390223 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A390223() {
    super(1, new Sequence1() {
      private Z mA = null;
      private Z mB = null;

      @Override
      public Z next() {
        if (mB == null) {
          if (mA == null) {
            mA = Z.valueOf(11);
            return mA;
          }
          mB = Z.valueOf(38);
          return mB;
        }
        final Z t = mB.multiply(4).subtract(mA);
        mA = mB;
        mB = t;
        return t;
      }
    }, k -> k.isProbablePrime() || Predicates.SEMIPRIME.is(k));
  }
}
