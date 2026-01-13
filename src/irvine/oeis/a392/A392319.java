package irvine.oeis.a392;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.UnionSequence;

/**
 * A392319 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A392319 extends UnionSequence {

  /** Construct the sequence. */
  public A392319() {
    super(new TwoParameterFormSequence(1, 2, 2, (b, k) -> Z.valueOf(b).pow(k).subtract(1)) {
            @Override
            protected boolean accept(final long x, final long y, final Z n, final Z prev) {
              return Predicates.PALINDROME.is(n);
            }
          },
      new TwoParameterFormSequence(1, 2, 2, (b, k) -> Z.valueOf(b).pow(k).add(1)) {
        @Override
        protected boolean accept(final long x, final long y, final Z n, final Z prev) {
          return Predicates.PALINDROME.is(n);
        }
      }
    );
  }
}

