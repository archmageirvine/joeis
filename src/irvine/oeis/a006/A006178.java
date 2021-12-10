package irvine.oeis.a006;

import irvine.oeis.transform.WittTransformSequence;
import irvine.oeis.a029.A029808;

/**
 * A006178 Witt vector *3!/3!.
 * @author Sean A. Irvine
 */
public class A006178 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006178() {
    super(new A029808());
    next();
  }
}
