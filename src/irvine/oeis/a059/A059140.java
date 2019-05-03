package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059140 A hierarchical sequence <code>(S(W2{2}*c) -</code> see <code>A059126)</code>.
 * @author Sean A. Irvine
 */
public class A059140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059140() {
    super(new long[] {2, -5, 4}, new long[] {4, 15, 40});
  }
}

