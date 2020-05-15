package irvine.oeis.a032;

import irvine.oeis.BhjTransformSequence;
import irvine.oeis.a000.A000027;

/**
 * A032079 "BHJ" <code>(reversible</code>, identity, labeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032079 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032079() {
    super(new A000027());
  }
}
