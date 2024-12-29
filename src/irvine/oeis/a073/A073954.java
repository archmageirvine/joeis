package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066417;

/**
 * A073638.
 * @author Sean A. Irvine
 */
public class A073954 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073954() {
    super(1, 1, new A066417(), (n, k) -> k.compareTo(2L * n) > 0);
  }
}
