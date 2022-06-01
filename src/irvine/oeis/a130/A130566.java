package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130566 Pyramidal 47-gonal numbers.
 * @author Sean A. Irvine
 */
public class A130566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130566() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 48, 186, 460});
  }
}
