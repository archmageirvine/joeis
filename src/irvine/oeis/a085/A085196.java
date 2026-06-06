package irvine.oeis.a085;

import irvine.oeis.Combiner;
import irvine.oeis.a072.A072795;

/**
 * A085196 Difference of row 1 and column 1 of the array A085201.
 * @author Sean A. Irvine
 */
public class A085196 extends Combiner {

  /** Construct the sequence. */
  public A085196() {
    super(0, new A085223(), new A072795(), SUBTRACT);
  }
}
