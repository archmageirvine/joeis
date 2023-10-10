package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a004.A004152;

/**
 * A066347 Numbers k such that (the sum of digits of k!)+1 is a prime.
 * @author Sean A. Irvine
 */
public class A066347 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066347() {
    super(1, 0, new A004152(), k -> k.add(1).isProbablePrime());
  }
}
