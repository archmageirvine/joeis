package irvine.oeis.a006;

import irvine.oeis.transform.WittTransformSequence;
import irvine.oeis.a074.A074651;

/**
 * A006174 Witt vector *3!.
 * @author Sean A. Irvine
 */
public class A006174 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006174() {
    super(new A074651());
    next();
  }
}
