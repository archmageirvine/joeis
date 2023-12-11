package irvine.oeis.a006;

import irvine.oeis.a022.A022553;
import irvine.oeis.transform.WittTransformSequence;

/**
 * A006177 Witt vector *2!/2!.
 * @author Sean A. Irvine
 */
public class A006177 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006177() {
    super(new A022553(), 1);
    next();
  }
}
