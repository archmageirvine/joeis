package irvine.oeis.a032;

import irvine.oeis.a054.A054977;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032077 "BHJ" (reversible, identity, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032077 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032077() {
    super(new A054977());
  }
}
