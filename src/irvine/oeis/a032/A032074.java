package irvine.oeis.a032;

import irvine.oeis.BhjTransformSequence;
import irvine.oeis.a059.A059841;

/**
 * A032074 "BHJ" <code>(reversible</code>, identity, labeled) transform of <code>1,0,1,0..</code>. (odds).
 * @author Sean A. Irvine
 */
public class A032074 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032074() {
    super(new A059841());
  }
}
