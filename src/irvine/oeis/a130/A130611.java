package irvine.oeis.a130;

import irvine.oeis.DistinctSequence;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000073;
import irvine.oeis.a009.A009000;

/**
 * A130611 Tribonacci numbers A000073 which can be the hypotenuse of a Pythagorean triple.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A130611 extends DistinctSequence {

  /** Construct the sequence. */
  public A130611() {
    super(1, new IntersectionSequence(new A000073(), new A009000()));
  }
}
