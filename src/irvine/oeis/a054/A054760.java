package irvine.oeis.a054;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.a198.A198300;
import irvine.util.string.StringUtils;

/**
 * A054760 Table T(n,k) = order of (n,k)-cage (smallest n-regular graph of girth k), n &gt;= 2, k &gt;= 3, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A054760 extends A198300 implements GraphProcessor {

  private static class FoundItException extends RuntimeException { }
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public void process(final Graph graph) throws IOException {
    if (graph.girth() >= mM + 3) {
      throw new FoundItException(); // Abort any further computation we found the solution
    }
  }

  @Override
  public Z next() {
    int n = super.next().intValueExact();
    while (true) {
      final int degree = mN + 1 - mM;
      if (mVerbose) {
        StringUtils.message("Trying " + n + " vertices with degree " + degree + " and target girth " + (mM + 3));
      }
      final GenerateGraphs gg = new GenerateGraphs(0);
      gg.setProcessor(this);
      gg.setVertices(n);
      gg.setMinDeg(degree);
      gg.setMaxDeg(degree);
      gg.setMinEdges(0);
      gg.setMaxEdges(Integer.MAX_VALUE);
      gg.setConnectionLevel(1);
      gg.sanitizeParams();
      try {
        gg.run(false, mM > 2, mM > 1, 0, 0);
      } catch (final FoundItException e) {
        return Z.valueOf(n);
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
      ++n;
    }
  }

}
