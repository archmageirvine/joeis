package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003295;

/**
 * A058205 McKay-Thompson series of class 11A for the Monster Group.
 * @author Sean A. Irvine
 */
public class A058205 extends PrependSequence {

  /** Construct the sequence. */
  public A058205() {
    super(new SkipSequence(new A003295(), 2), 1, 0);
  }
}
