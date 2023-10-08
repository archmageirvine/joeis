package irvine.oeis.a066;

import irvine.oeis.FilterSequence;
import irvine.oeis.a034.A034710;

/**
 * A066306 Prime numbers such that sum of digits equals product of digits.
 * @author Sean A. Irvine
 */
public class A066306 extends FilterSequence {

  /** Construct the sequence. */
  public A066306() {
    super(1, new A034710(), PRIME);
  }
}

