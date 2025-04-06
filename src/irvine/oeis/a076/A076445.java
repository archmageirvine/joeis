package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001694;

/**
 * A076445 The smaller of a pair of powerful numbers (A001694) that differ by 2.
 * @author Sean A. Irvine
 */
public class A076445 extends FilterSequence {

  // This is too slow to be useful ...

  /** Construct the sequence. */
  public A076445() {
    super(new A001694(), k -> Predicates.POWERFUL.is(k.add(2)));
  }
}
