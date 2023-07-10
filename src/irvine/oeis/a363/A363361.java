package irvine.oeis.a363;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A363361 Decimal expansion of real number [1,0,0,1,...] formed by taking the complementary Thue-Morse sequence (A010059) as partial quotients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A363361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A363361() {
    super(1, new A363360().getCR().inverse());
  }
}
