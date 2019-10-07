package irvine.oeis.a006;

/**
 * A006616 Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A006616 extends A006614 {

  @Override
  protected boolean isZarankiewicz(final long[] matrix) {
    // Check exists a 4xj submatrix all ones
    for (int row1 = 0; row1 < matrix.length - 3; ++row1) {
      final long r1 = matrix[row1];
      if ((long) Long.bitCount(r1) >= j()) {
        for (int row2 = row1 + 1; row2 < matrix.length - 2; ++row2) {
          final long r2 = matrix[row2] & r1;
          if ((long) Long.bitCount(r2) >= j()) {
            for (int row3 = row2 + 1; row3 < matrix.length - 1; ++row3) {
              final long r3 = matrix[row3] & r2;
              if ((long) Long.bitCount(r3) >= j()) {
                for (int row4 = row3 + 1; row4 < matrix.length; ++row4) {
                  final long r4 = matrix[row4] & r3;
                  if ((long) Long.bitCount(r4) >= j()) {
                    // Found 4 rows with at least j ones in same place, hence exist column selection
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
}

