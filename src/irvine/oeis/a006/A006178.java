package irvine.oeis.a006;

import irvine.oeis.WittTransformSequence;
import irvine.oeis.a029.A029808;

/**
 * A006178.
 * @author Sean A. Irvine
 */
public class A006178 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006178() {
    super(new A029808());
    next();
  }
}
