package irvine.oeis.a006;

import irvine.oeis.a029.A029809;
import irvine.oeis.transform.WittTransformSequence;

/**
 * A006179 Witt vector *4!/4!.
 * @author Sean A. Irvine
 */
public class A006179 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006179() {
    super(new A029809());
    next();
  }
}
