package irvine.math;

/**
 * Provides various functions operating on bytes.
 * @author Sean A. Irvine
 */
public final class ByteUtils {

  private ByteUtils() {
  }

  /**
   * Reverse the bits of a byte.
   * @param x byte to reverse
   * @return reverse value
   */
  public static byte reverse(final byte x) {
    int b = x;
    b = (b & 0xF0) >>> 4 | (b & 0x0F) << 4;
    b = (b & 0xCC) >>> 2 | (b & 0x33) << 2;
    b = (b & 0xAA) >>> 1 | (b & 0x55) << 1;
    return (byte) b;
  }

  /**
   * Reverse in place the bits of each byte in an array
   * @param data array to reverse
   */
  public static void reverse(final byte[] data) {
    for (int k = 0; k < data.length; ++k) {
      data[k] = reverse(data[k]);
    }
  }
}


