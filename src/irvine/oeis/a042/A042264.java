package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042264 Numerators of continued fraction convergents to <code>sqrt(658)</code>.
 * @author Sean A. Irvine
 */
public class A042264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042264() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3386, 0, 0, 0, 0, 0, 0, 0}, new long[] {25, 26, 51, 77, 513, 590, 1103, 1693, 85753, 87446, 173199, 260645, 1737069, 1997714, 3734783, 5732497});
  }
}
