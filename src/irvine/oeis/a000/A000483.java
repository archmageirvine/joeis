package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000483 Associated Stirling numbers: second order reciprocal Stirling numbers (Fekete) <code>[[n, 3]]</code>. The number of 3-orbit permutations of an n-set with at least 2 elements in each orbit.
 * @author Sean A. Irvine
 */
public class A000483 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Stirling.associatedFirstKind(++mN, 3);
  }
}
