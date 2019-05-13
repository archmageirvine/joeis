package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021979.
 * @author Sean A. Irvine
 */
public class A021979 extends PrependSequence {

  /** Construct the sequence. */
  public A021979() {
    super(new PeriodicSequence(1, 0, 2, 5, 6, 4), 0, 0);
  }
}

