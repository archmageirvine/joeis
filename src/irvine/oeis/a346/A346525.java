package irvine.oeis.a346;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a091.A091556;

/**
 * A346525 Decimal expansion of gamma/(1 - gamma), where gamma is the Euler-Mascheroni constant.
 * @author Georg Fischer
 */
public class A346525 extends PrependSequence {

  /** Construct the sequence. */
  public A346525() {
    super(1, new A091556().skip(1), 1);
  }
}
