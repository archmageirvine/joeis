package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a057.A057127;

/**
 * A034032 Imprimitively but not primitively represented by x^2+2y^2.
 * @author Sean A. Irvine
 */
public class A034032 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034032() {
    super(new A034030(), new A057127());
  }
}
