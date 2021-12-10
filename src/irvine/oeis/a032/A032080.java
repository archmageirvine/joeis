package irvine.oeis.a032;

import irvine.oeis.a005.A005408;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032080 "BHJ" (reversible, identity, labeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032080 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032080() {
    super(new A005408());
  }
}
