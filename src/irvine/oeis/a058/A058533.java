package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a215.A215412;

/**
 * A058533 McKay-Thompson series of class 18C for the Monster group.
 * @author Sean A. Irvine
 */
public class A058533 extends PrependSequence {

  /** Construct the sequence. */
  public A058533() {
    super(new SkipSequence(new A215412(), 2), 1, 0);
  }
}
