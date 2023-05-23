package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A063850 Say what you see in previous term, reporting total number for each digit encountered.
 * @author Sean A. Irvine
 */
public class A063850 extends PrependSequence {

  /** Construct the sequence. */
  public A063850() {
    super(new PeriodicSequence(23322114, 32232114), 1, 11, 21, 1211, 3112, 132112, 311322, 232122, 421311, 14123113, 41141223, 24312213, 32142321);
  }
}
