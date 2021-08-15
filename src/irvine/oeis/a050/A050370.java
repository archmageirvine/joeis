package irvine.oeis.a050;

import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.a001.A001055;

/**
 * A050370 Number of ways to factor n into composite factors.
 * @author Sean A. Irvine
 */
public class A050370 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A050370() {
    super(new A001055(), 0);
    next();
  }
}
