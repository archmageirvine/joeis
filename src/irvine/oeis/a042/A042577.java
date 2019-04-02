package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042577 Denominators of continued fraction convergents to sqrt(817).
 * @author Sean A. Irvine
 */
public class A042577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042577() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 686, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 12, 679, 691, 1370, 3431, 4801, 8232});
  }
}
