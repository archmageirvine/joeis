package irvine.oeis.a354;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010502;

/**
 * A354129 Decimal expansion of 7 + 4*sqrt(3).
 * @author Georg Fischer
 */
public class A354129 extends PrependSequence {

  /** Construct the sequence. */
  public A354129() {
    super(1, new A010502(), 1, 3);
  }
}
