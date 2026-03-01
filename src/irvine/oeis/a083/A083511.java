package irvine.oeis.a083;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000124;

/**
 * A083511 Members of A000124 which are multiples of 11.
 * @author Sean A. Irvine
 */
public class A083511 extends FilterSequence {

  /** Construct the sequence. */
  public A083511() {
    super(0, new A000124(), k -> k.mod(11) == 0);
  }
}

