package irvine.oeis.a032;

import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.a000.A000035;

/**
 * A032277 Number of ways to partition n elements into pie slices each with an odd number of elements allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032277 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032277() {
    super(new A000035(), 1);
  }
}
