package irvine.oeis.a032;

import irvine.oeis.a054.A054977;
import irvine.oeis.transform.ChjTransformSequence;

/**
 * A032329 "CHJ" (necklace, identity, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032329 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032329() {
    super(new A054977());
  }
}
