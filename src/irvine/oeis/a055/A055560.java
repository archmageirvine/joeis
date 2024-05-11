package irvine.oeis.a055;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a001.A001106;

/**
 * A055560 Base numbers of 9-gonal palindromic numbers.
 * @author Sean A. Irvine
 */
public class A055560 extends A001106 {

  /** Construct the sequence. */
  public A055560() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    while (!Predicates.PALINDROME.is(super.next())) {
      // do nothing
    }
    return mN;
  }
}
