package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041986 Numerators of continued fraction convergents to <code>sqrt(516)</code>.
 * @author Sean A. Irvine
 */
public class A041986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041986() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33710, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {22, 23, 68, 91, 159, 2317, 2476, 4793, 12062, 16855, 753682, 770537, 2294756, 3065293, 5360049, 78105979, 83466028, 161572007, 406610042, 568182049});
  }
}
