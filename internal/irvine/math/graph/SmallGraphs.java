package irvine.math.graph;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;

/**
 * Generate dot files for small graphs.
 * @author Sean A. Irvine
 */
public final class SmallGraphs implements GraphProcessor {

  private SmallGraphs() {
  }

  private int mIndex = -1;

  @Override
  public void process(final Graph graph) {
    final int n = graph.order();
    try (final PrintStream out = new PrintStream(new FileOutputStream("g" + n + "_" + ++mIndex + ".dot"))) {
      out.print(GraphUtils.toDot(graph));
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Generate dot files for small graphs.
   * @param args ignored
   */
  public static void main(final String[] args) {
    new SmallGraphs().process(GraphFactory.create(0)); // handle empty graph
    for (int n = 1; n <= 5; ++n) {
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setProcessor(new SmallGraphs());
      gg.setVertices(n);
      gg.setMinEdges(0);
      gg.setMaxEdges(n * (n - 1) / 2);
      gg.setMinDeg(0);
      gg.setMaxDeg(n);
      gg.setConnectionLevel(0);
      gg.sanitizeParams();
      gg.run(false, false, false, 0, 0);
    }
  }
}

