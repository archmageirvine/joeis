package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011827 f-vectors for simplicial complexes of dimension at most 2 on at most n-1 vertices.
 * @author Sean A. Irvine
 */
public class A011827 extends A007695 {

  /** Construct the sequence. */
  public A011827() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 3);
  }
}
