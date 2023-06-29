package irvine.oeis.a062;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a049.A049415;

/**
 * A062940 Number of squares (including 0) with n digits.
 * @author Sean A. Irvine
 */
public class A062940 extends PrependSequence {

  /** Construct the sequence. */
  public A062940() {
    super(1, new SkipSequence(new A049415(), 1), 4);
  }
}

