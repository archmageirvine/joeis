package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192791 Molecular topological indices of the antiprism graphs.
 * @author Sean A. Irvine
 */
public class A192791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192791() {
    super(new long[] {-1, 4, -6, 4}, new long[] {40, 112, 240, 448});
  }
}
