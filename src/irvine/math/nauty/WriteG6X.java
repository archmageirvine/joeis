package irvine.math.nauty;

import java.io.IOException;
import java.io.Writer;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;

/**
 * Write graph in <code>graph6</code> format.
 * @author Sean A. Irvine
 */
class WriteG6X implements GraphProcessor {

  private final Writer mOut;

  /**
   * Graph processor that writes graphs in text format.
   * @param out output stream
   */
  WriteG6X(final Writer out) {
    mOut = out;
  }

  @Override
  public void process(final Graph graph) {
    try {
      mOut.write(Graph6.toGraph6(graph) + "\n");
      mOut.flush();
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}
