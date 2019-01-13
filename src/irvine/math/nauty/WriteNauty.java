package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;
import irvine.util.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;

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
  public void process(final Graph graph) throws IOException {
    if (!(graph instanceof SmallGraph)) {
      throw new UnsupportedOperationException();
    }
    final int n = graph.order();
    IOUtils.writeInt(mOut, n);
    for (int k = 0; k < n; ++k) {
      IOUtils.writeLong(mOut, ((SmallGraph) graph).getEdgeVector(k));
    }
    mOut.flush();
  }
}
