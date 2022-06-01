package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021879 Decimal expansion of 1/875.
 * @author Sean A. Irvine
 */
public class A021879 extends PrependSequence {

  /** Construct the sequence. */
  public A021879() {
    super(new PeriodicSequence(1, 4, 2, 8, 5, 7), 0, 0, 1);
  }
}

