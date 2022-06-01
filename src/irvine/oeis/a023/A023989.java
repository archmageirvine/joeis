package irvine.oeis.a023;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A023989 Look and Say sequence: describe the previous term! (method C - initial term is 2).
 * @author Sean A. Irvine
 */
public class A023989 extends PrependSequence {

  /** Construct the sequence. */
  public A023989() {
    super(new PeriodicSequence(21322314), 2, 12, 1112, 3112, 211213, 312213, 212223, 114213, 31121314, 41122314, 31221324);
  }
}

