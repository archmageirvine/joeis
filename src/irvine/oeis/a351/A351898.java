package irvine.oeis.a351;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010503;

/**
 * A351898 Decimal expansion of metallic ratio for N = 14.
 * @author Georg Fischer
 */
public class A351898 extends PrependSequence {

  /** Construct the sequence. */
  public A351898() {
    super(1, new A010503(), 1, 4);
  }
}
