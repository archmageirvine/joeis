package irvine.oeis.a029;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a001.A001285;

/**
 * A029883 First differences of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029883 extends DifferenceSequence {

  /** Construct the sequence. */
  public A029883() {
    super(1, new A001285());
  }
}
