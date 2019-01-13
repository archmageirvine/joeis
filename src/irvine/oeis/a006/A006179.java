package irvine.oeis.a006;

import irvine.oeis.WittTransformSequence;
import irvine.oeis.a029.A029809;

/**
 * A006179.
 * @author Sean A. Irvine
 */
public class A006179 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006179() {
    super(new A029809());
    next();
  }
}
