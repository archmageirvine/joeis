package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;

import java.io.IOException;
import java.io.Writer;

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
  public void process(final Graph graph) throws IOException {
    mOut.write(Graph6.toGraph6(graph) + "\n");
    mOut.flush();
  }
}
