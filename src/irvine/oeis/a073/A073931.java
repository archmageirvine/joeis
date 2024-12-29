package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066417;

/**
 * A073929.
 * @author Sean A. Irvine
 */
public class A073931 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073931() {
    super(1, 1, new A066417(), (n, k) -> k.equals(2L * n));
  }
}

