package irvine.oeis.a006;

import irvine.math.nauty.GenerateGraphs;

/**
 * A006610.
 * @author Sean A. Irvine
 */
public class A006610 extends A006608 {

  @Override
  protected void init(final GenerateGraphs gg, final int n) {
    gg.setConnectionLevel(1);
    gg.setVertices(n);
    gg.setMinEdges(n - 1);
    gg.setMaxEdges(n - 1);
  }
}
