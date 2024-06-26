package irvine.oeis.a056;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002378;

/**
 * A056794 Numbers n such that n*(n-1) is an oblong (promic, A002378) palindrome.
 * @author Sean A. Irvine
 */
public class A056794 extends A002378 {

  /** Construct the sequence. */
  public A056794() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(super.next())) {
        return mN;
      }
    }
  }
}
