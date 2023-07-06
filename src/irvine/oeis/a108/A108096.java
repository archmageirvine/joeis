package irvine.oeis.a108;

import irvine.oeis.a008.A008658;
import irvine.oeis.transform.RootSequence;

/**
 * A108096 Coefficients of square root of theta series of D_4 (see A004011).
 * @author Georg Fischer
 */
public class A108096 extends RootSequence {

  /** Construct the sequence. */
  public A108096() {
    super(0, new A008658().skip(1), 1, 4);
  }
}
