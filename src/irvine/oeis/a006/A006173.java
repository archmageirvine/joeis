package irvine.oeis.a006;

import irvine.oeis.a060.A060165;
import irvine.oeis.transform.WittTransformSequence;

/**
 * A006173 Witt vector *2!.
 * @author Sean A. Irvine
 */
public class A006173 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006173() {
    super(new A060165());
    next();
  }
}
