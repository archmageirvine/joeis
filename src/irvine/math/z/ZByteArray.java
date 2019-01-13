package irvine.math.z;

/**
 * Conversion to byte array.
 *
 * @author Sean A. Irvine
 */
final class ZByteArray {

  private ZByteArray() { }

  /**
   * Return this integer as a two-complement byte array with the
   * most significant byte of the integer in the zeroth array
   * position (that is, big-endian order).
   *
   * @param n number
   * @return byte array representation
   */
  static byte[] toByteArray(final Z n) {
    final int len = n.bitLength() / 8 + 1;
    final byte[] b = new byte[len];
    long v = 0L;
    for (int i = len - 1, j = 0, k = 0; i >= 0; --i) {
      if (k < 8) {
        v += ((long) (Logical.getDigit(n, j++) & Z.BASE_MASK)) << k;
        k += Z.BASE_BITS;
      }
      b[i] = (byte) v;
      v >>>= 8;
      k -= 8;
    }
    return b;
  }

}
