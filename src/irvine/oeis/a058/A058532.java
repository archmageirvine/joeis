package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a215.A215407;

/**
 * A058532 McKay-Thompson series of class 18B for the Monster group.
 * @author Sean A. Irvine
 */
public class A058532 extends PrependSequence {

  /** Construct the sequence. */
  public A058532() {
    super(new SkipSequence(new A215407(), 2), 1, 0);
  }
}
