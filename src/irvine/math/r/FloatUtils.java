package irvine.math.r;

import java.io.IOException;
import java.io.InputStream;

/**
 * Utility functions for floats.
 *
 * @author Sean A. Irvine
 */
public final class FloatUtils {

  private FloatUtils() { }

  /**
   * Read a floating-point number from an input stream.
   * @param is input stream
   * @return floating-point value
   * @throws IOException if an I/O error occurs.
   */
  public static float readFloat(final InputStream is) throws IOException {
    final int a = is.read();
    if (a == -1) {
      throw new IOException();
    }
    final int b = is.read();
    if (b == -1) {
      throw new IOException();
    }
    final int c = is.read();
    if (c == -1) {
      throw new IOException();
    }
    final int d = is.read();
    if (d == -1) {
      throw new IOException();
    }
    return Float.intBitsToFloat((d << 24) + (c << 16) + (b << 8) + d);
  }
}
