package irvine.oeis.a069;

import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065220;

/**
 * A069098.
 * @author Sean A. Irvine
 */
public class A069109 extends FilterSequence {

  /** Construct the sequence. */
  public A069109() {
    super(1, new A065220(), PRIME);
  }
}

