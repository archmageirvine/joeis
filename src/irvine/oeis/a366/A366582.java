package irvine.oeis.a366;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a062.A062394;

/**
 * A366582 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A366582 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A366582() {
    super(1, 0, new A062394(), SEMIPRIME);
  }
}
