package irvine.oeis.a069;

import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024675;

/**
 * A069457.
 * @author Sean A. Irvine
 */
public class A069495 extends FilterSequence {

  /** Construct the sequence. */
  public A069495() {
    super(1, new A024675(), SQUARE);
  }
}

