package irvine.oeis.a029;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002034;

/**
 * A029717 First differences of Kempner numbers A002034.
 * @author Sean A. Irvine
 */
public class A029717 extends DifferenceSequence {

  /** Construct the sequence. */
  public A029717() {
    super(1, new A002034());
  }
}
