package irvine.oeis.a331;

import irvine.math.nauty.GenerateGraphs;

/**
 * A331237.
 * @author Sean A. Irvine
 */
public class A331237 extends A331236 {

  /** Construct the sequence. */
  public A331237() {
    super();
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
  }
}
