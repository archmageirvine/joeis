package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.a053.A053067;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076068 Smallest number that can be formed by using the nonzero digits of the numbers 1+n(n-1)/2 through n(n+1)/2.
 * @author Sean A. Irvine
 */
public class A076068 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076068() {
    super(new A053067(), k -> Functions.DIGIT_SORT_ASCENDING.z(k));
  }
}
