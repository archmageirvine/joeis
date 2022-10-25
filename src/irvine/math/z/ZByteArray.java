package irvine.math.z;

import java.util.Arrays;

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
    // Evil but rare correction (e.g. for -128)
    if (b[0] == -1 && b.length > 1 && b[1] < 0) {
      return Arrays.copyOfRange(b, 1, b.length);
    }
    return b;
  }

}
