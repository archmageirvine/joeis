package irvine.oeis.a067;

import irvine.oeis.RecordSequence;

/**
 * A067036 Records for the number of integers k such that an integer is of the form k + reverse(k).
 * @author Sean A. Irvine
 */
public class A067036 extends RecordSequence {

  /** Construct the sequence. */
  public A067036() {
    super(new A067032());
  }
}

