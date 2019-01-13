package irvine.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Count the number of ways to edge colour a graph.
 * @author Sean A. Irvine
 */
public class EdgeColouring extends AbstractEdgeColouring<Integer, String> {

  private long mCount = 0;

  /**
   * Prepare for colouring.
   * @param graph graph to colour
   * @param colours number of colours
   */
  public EdgeColouring(final Graph<Integer, String> graph, final int colours) {
    super(graph, colours);
  }

  @Override
  protected void process(final Map<Edge<String, Integer>, Integer> colouring) {
    ++mCount;
  }

  /**
   * Return the count of colourings
   * @return count of colourings
   */
  public long getCount() {
    return mCount;
  }

  /**
   * Reads from standard input.
   *
   * @param args number of colours
   * @throws java.io.IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    final int colours = Integer.parseInt(args[0]);
    Z count = Z.ZERO;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty()) {
          final Graph<Integer, String> g = EdgeThreeColouring.makeGraph(line);
          final EdgeColouring ci = new EdgeColouring(g, colours);
          ci.run();
          System.out.println(line + " colourings=" + ci.getCount());
          count = count.add(ci.getCount());
        }
      }
    }
    System.out.println(count);
  }
}
