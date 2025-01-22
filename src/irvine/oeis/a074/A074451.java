package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046099;

/**
 * A074351.
 * @author Sean A. Irvine
 */
public class A074451 extends FilterSequence {

  /** Construct the sequence. */
  public A074451() {
    super(1, new A046099(), k -> !Predicates.CUBE.is(k));
  }
}
