package irvine.oeis.a237;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A237026 Number of partitions of the n-dimensional hypercube resulting from a sequence of n bisections, each of which splits any part perpendicular to any of the axes.
 * @author Georg Fischer
 */
public class A237026 extends A237018 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, mN);
  }
}

