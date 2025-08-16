package irvine.oeis.a380;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a025.A025487;

/**
 * A380452 Perfect powers k^m, m &gt; 1, omega(k) &gt; 1, such that A053669(k) &gt; A006530(k) that are not also products of primorials, where omega = A001221.
 * @author Sean A. Irvine
 */
public class A380452 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A380452() {
    super(1, new A380446(), new A025487());
  }
}
