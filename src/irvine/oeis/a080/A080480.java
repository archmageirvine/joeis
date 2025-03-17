package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.a053.A053067;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080480 Largest number formed by using all the digits (with multiplicity) of next n numbers.
 * @author Sean A. Irvine
 */
public class A080480 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080480() {
    super(new A053067(), k -> Functions.DIGIT_SORT_DESCENDING.z(k));
  }
}
