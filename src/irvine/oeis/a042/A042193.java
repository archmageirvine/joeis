package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042193 Denominators of continued fraction convergents to <code>sqrt(621)</code>.
 * @author Sean A. Irvine
 */
public class A042193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042193() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 15550, 0, 0, 0, 0, 0}, new long[] {1, 1, 12, 25, 287, 312, 15263, 15575, 186588, 388751, 4462849, 4851600});
  }
}
