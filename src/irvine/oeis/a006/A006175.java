package irvine.oeis.a006;

import irvine.oeis.a074.A074652;
import irvine.oeis.transform.WittTransformSequence;

/**
 * A006175 Witt vector *4!.
 * @author Sean A. Irvine
 */
public class A006175 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006175() {
    super(new A074652());
    next();
  }
}
