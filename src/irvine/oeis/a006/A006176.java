package irvine.oeis.a006;

import irvine.oeis.transform.WittTransformSequence;
import irvine.oeis.a074.A074653;

/**
 * A006176 Witt vector *5!.
 * @author Sean A. Irvine
 */
public class A006176 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006176() {
    super(new A074653());
    next();
  }
}
