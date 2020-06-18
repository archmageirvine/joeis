package irvine.oeis.a032;

import irvine.oeis.ChjTransformSequence;
import irvine.oeis.a000.A000027;

/**
 * A032331 "CHJ" <code>(necklace</code>, identity, labeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032331 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032331() {
    super(new A000027());
  }
}
