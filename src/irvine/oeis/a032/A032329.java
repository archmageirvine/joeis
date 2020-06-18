package irvine.oeis.a032;

import irvine.oeis.ChjTransformSequence;
import irvine.oeis.a054.A054977;

/**
 * A032329 "CHJ" <code>(necklace</code>, identity, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032329 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032329() {
    super(new A054977());
  }
}
