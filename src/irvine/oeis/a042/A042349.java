package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042349 Denominators of continued fraction convergents to sqrt(701).
 * @author Sean A. Irvine
 */
public class A042349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042349() {
    super(new long[] {1, 0, 0, 0, 0, 23564, 0, 0, 0, 0}, new long[] {1, 2, 21, 212, 445, 23352, 47149, 494842, 4995569, 10485980});
  }
}
