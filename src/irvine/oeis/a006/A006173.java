package irvine.oeis.a006;

import irvine.oeis.WittTransformSequence;
import irvine.oeis.a060.A060165;

/**
 * A006173 Witt vector <code>*2!</code>.
 * @author Sean A. Irvine
 */
public class A006173 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006173() {
    super(new A060165());
    next();
  }
}
