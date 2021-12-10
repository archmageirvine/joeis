package irvine.oeis.a032;

import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.a057.A057427;

/**
 * A032278 Number of ways to partition n elements into pie slices each with at least 2 elements allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032278 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032278() {
    super(new A057427(), 0);
  }
}
