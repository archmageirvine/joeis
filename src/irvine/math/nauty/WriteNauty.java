package irvine.math.nauty;

import java.io.IOException;
import java.io.OutputStream;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;
import irvine.util.io.IOUtils;

/**
 * Write graph in nauty format.
 * @author Sean A. Irvine
 */
class WriteNauty implements GraphProcessor {

  private final OutputStream mOut;

  /**
   * Writer for nauty binary format.
   * @param out output stream
   */
  WriteNauty(final OutputStream out) {
    mOut = out;
  }

  @Override
  public void process(final Graph graph) {
    if (!(graph instanceof SmallGraph)) {
      throw new UnsupportedOperationException();
    }
    final int n = graph.order();
    try {
      IOUtils.writeInt(mOut, n);
      for (int k = 0; k < n; ++k) {
        IOUtils.writeLong(mOut, ((SmallGraph) graph).getEdgeVector(k));
      }
      mOut.flush();
    } catch(final IOException e) {
      throw new RuntimeException(e);
    }
  }
}
