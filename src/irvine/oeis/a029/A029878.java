package irvine.oeis.a029;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a001.A001285;

/**
 * A029878.
 * @author Sean A. Irvine
 */
public class A029878 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A029878() {
    super(new A001285(), 0);
    next();
  }
}
