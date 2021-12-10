package irvine.oeis.a032;

import irvine.oeis.transform.ChjTransformSequence;
import irvine.oeis.a005.A005408;

/**
 * A032332 "CHJ" (necklace, identity, labeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032332 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032332() {
    super(new A005408());
  }
}
