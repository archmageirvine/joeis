package irvine.oeis.a069;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;

import irvine.math.group.RationalGroupCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069481 Number of conjugacy classes of irreducible maximal finite subgroups of GL_n(Q) (the group of invertible rational n X n matrices).
 * @author Gregory Morse
 */
public class A069481 extends Sequence1 {

  private RationalGroupCensus mCensus;
  private int mN = 0;

  @Override
  public Z next() {
    if (mCensus == null) {
      final String directory = System.getProperty("joeis.a069481.data");
      if (directory == null) {
        throw new UnsupportedOperationException("Set joeis.a069481.data to the directory of structural group records");
      }
      mCensus = new RationalGroupCensus(Path.of(directory));
    }
    try {
      final int count = mCensus.maximal(mN + 1);
      ++mN;
      return Z.valueOf(count);
    } catch (final IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
