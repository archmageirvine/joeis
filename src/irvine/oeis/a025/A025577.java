package irvine.oeis.a025;

import irvine.oeis.PartialSumSequence;

/**
 * A025577 Expansion of <code>(x/(1-x))*sqrt((1+x)/(1-3*x))</code>.
 * @author Sean A. Irvine
 */
public class A025577 extends PartialSumSequence {

  /** Construct the sequence. */
  public A025577() {
    super(new A025565());
  }
}
