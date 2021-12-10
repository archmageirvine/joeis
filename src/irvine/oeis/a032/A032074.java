package irvine.oeis.a032;

import irvine.oeis.a059.A059841;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032074 "BHJ" (reversible, identity, labeled) transform of 1,0,1,0... (odds).
 * @author Sean A. Irvine
 */
public class A032074 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032074() {
    super(new A059841());
  }
}
