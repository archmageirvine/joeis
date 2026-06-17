package irvine.oeis.a085;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A085348 Ratio-determined insertion sequence I(0.264) (see the link below).
 * @author Sean A. Irvine
 */
public class A085348 extends LinearRecurrence implements Conjectural {

  /** Construct the sequence. */
  public A085348() {
    super(0, new long[] {-1, 0, 18, 0}, new long[] {1, 4, 19, 72});
  }
}
