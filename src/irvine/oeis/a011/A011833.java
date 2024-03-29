package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011833 Number of f-vectors for simplicial complexes of dimension at most 8 on at most n-1 vertices.
 * @author Sean A. Irvine
 */
public class A011833 extends A007695 {

  /** Construct the sequence. */
  public A011833() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 9);
  }
}
