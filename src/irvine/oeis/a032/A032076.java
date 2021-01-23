package irvine.oeis.a032;

import irvine.oeis.BhjTransformSequence;
import irvine.oeis.a007.A007395;

/**
 * A032076 "BHJ" (reversible, identity, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032076 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032076() {
    super(new A007395());
  }
}
