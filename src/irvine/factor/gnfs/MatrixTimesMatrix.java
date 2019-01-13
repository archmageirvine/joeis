package irvine.factor.gnfs;

/**
 * Matrix multiplications.
 *
 * @author Kleinjung Thorsten
 * @author Sean A. Irvine
 */
final class MatrixTimesMatrix {

  private MatrixTimesMatrix() { }

  static void multiplyMatrix(final long[] m1, final long[] m2, final long[] m3) {
    // this could be better if m2,m1 != m3
    final long[] helpmat = new long[64];
    for (int i = 0; i < 64; ++i) {
      long h = 0L;
      long mask = 0x8000000000000000L;
      for (int j = 0; j < 64; ++j) {
        if ((m1[i] & mask) != 0) {
          h ^= m2[j];
        }
        mask >>>= 1;
      }
      helpmat[i] = h;
    }
    System.arraycopy(helpmat, 0, m3, 0, 64);
  }

  static void multiplyMatrixTMatrix(final long[] m1, final long[] m2, final long[] m3) {
    // m3 = m1^T*m2
    // assumes args differ
    assert m1 != m3;
    assert m2 != m3;

    long mask = 0x8000000000000000L;
    for (int i = 0; i < m1.length; ++i) {
      long h = 0L;
      for (int j = 0; j < m1.length; ++j) {
        if ((m1[j] & mask) != 0) {
          h ^= m2[j];
        }
      }
      m3[i] = h;
      mask >>>= 1;
    }
  }

}
