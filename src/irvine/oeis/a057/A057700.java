package irvine.oeis.a057;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a031.A031883;

/**
 * A057700 The next new gap between successive lucky numbers.
 * @author Sean A. Irvine
 */
public class A057700 extends DistinctSequence {

  /** Construct the sequence. */
  public A057700() {
    super(new A031883());
  }
}
