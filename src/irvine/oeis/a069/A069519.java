package irvine.oeis.a069;

import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066192;

/**
 * A069519 Numbers k such that 1/(Sum_{d|k} (-1)^d/d) is an integer.
 * @author Sean A. Irvine
 */
public class A069519 extends PrependSequence {

  /** Construct the sequence. */
  public A069519() {
    super(1, new A066192(), 1, 2);
  }
}
