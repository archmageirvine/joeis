package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007913;

/**
 * A069189 Numbers k such that A007913(k) &lt; sqrt(k).
 * @author Sean A. Irvine
 */
public class A069189 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069189() {
    super(1, 1, new A007913(), (k, v) -> v.square().compareTo(Z.valueOf(k)) < 0);
  }
}

