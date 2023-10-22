package irvine.oeis.a366;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a052.A052539;

/**
 * A366648 Numbers k such that 4^k + 1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A366648 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A366648() {
    super(1, 0, new A052539(), SEMIPRIME);
  }
}
