package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a057.A057809;

/**
 * A058010.
 * @author Sean A. Irvine
 */
public class A058011 extends PrependSequence {

  /** Construct the sequence. */
  public A058011() {
    super(new SkipSequence(new A057809(), 1), 1);
  }
}
