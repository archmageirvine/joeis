package irvine.oeis.a032;

import irvine.oeis.BikTransformSequence;
import irvine.oeis.a000.A000027;

/**
 * A032126 "BIK" (reversible, indistinct, unlabeled) transform of <code>1,2,3,4..</code>.
 * @author Sean A. Irvine
 */
public class A032126 extends BikTransformSequence {

  /** Construct this sequence. */
  public A032126() {
    super(new A000027(), 0);
    next();
  }
}
