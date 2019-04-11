package irvine.oeis.a004;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a046.A046951;

/**
 * A004101 Number of partitions of n of the form a_1*b_1^2 + a_2*b_2^2 <code>+ ...</code>; number of semi-simple rings with n elements.
 * @author Sean A. Irvine
 */
public class A004101 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A004101() {
    super(new A046951(), 0);
  }
}

