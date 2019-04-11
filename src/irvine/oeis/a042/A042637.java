package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042637 Denominators of continued fraction convergents to <code>sqrt(848)</code>.
 * @author Sean A. Irvine
 */
public class A042637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042637() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 132498, 0, 0, 0, 0, 0}, new long[] {1, 8, 25, 83, 274, 2275, 132224, 1060067, 3312425, 10997342, 36304451, 301432950});
  }
}
