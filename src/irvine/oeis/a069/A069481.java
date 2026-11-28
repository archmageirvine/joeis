package irvine.oeis.a069;

import java.io.IOException;
import java.io.UncheckedIOException;

import irvine.math.group.RationalGroupCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069481 Number of conjugacy classes of irreducible maximal finite subgroups of GL_n(Q) (the group of invertible rational n X n matrices).
 * @author Gregory Morse
 */
public class A069481 extends Sequence1 {

  private final RationalGroupCensus mCensus = new RationalGroupCensus();
  private int mN = 0;

  @Override
  public Z next() {
    try {
      final int count = mCensus.maximal(mN + 1);
      ++mN;
      return Z.valueOf(count);
    } catch (final IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
