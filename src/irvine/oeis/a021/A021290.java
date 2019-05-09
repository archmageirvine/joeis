package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021290.
 * @author Sean A. Irvine
 */
public class A021290 extends PrependSequence {

  /** Construct the sequence. */
  public A021290() {
    super(new PeriodicSequence(0, 3, 4, 9, 6, 5), 0);
  }
}
