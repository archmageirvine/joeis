package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.math.z.Z;

/**
 * A sequence backed by a file or reader.
 * @author Sean A. Irvine
 */
public class ReaderSequence extends Sequence0 implements AutoCloseable {

  private final BufferedReader mReader;

  /**
   * Create a sequence backed by the given reader. The reader is assumed to
   * have ASCII representations of sequence terms, one per line.
   * @param reader the reader
   */
  public ReaderSequence(final BufferedReader reader) {
    mReader = reader;
  }

  @Override
  public Z next() {
    try {
      final String line = mReader.readLine();
      if (line == null) {
        return null; // end of sequence
      }
      return new Z(line);
    } catch (final IOException e) {
      throw new UnsupportedOperationException(e);
    }
  }

  @Override
  public void close() throws IOException {
    mReader.close();
  }
}
