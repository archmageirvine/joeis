package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a056.A056004;

/**
 * A057650 Second step in Goodstein sequences, i.e., g(4) if g(2)=n: (first step) write g(2)=n in hereditary representation base 2, bump to base 3, then subtract 1 to produce g(3)=A056004(n), then (second step) write g(3) in hereditary representation base 3, bump to base 4, then subtract 1 to produce g(4).
 * @author Sean A. Irvine
 */
public class A057650 extends A056004 {

  /** Construct the sequence. */
  public A057650() {
    super(2);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return code(super.next(), 3);
  }
}
