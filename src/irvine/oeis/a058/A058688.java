package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a132.A132322;

/**
 * A058688 McKay-Thompson series of class 46A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058688 extends PrependSequence {

  /** Construct the sequence. */
  public A058688() {
    super(new SkipSequence(new A132322(), 2), 1, 0);
  }
}
