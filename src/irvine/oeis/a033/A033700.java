package irvine.oeis.a033;

import irvine.math.graph.GraphUtils;
import irvine.oeis.a002.A002851;

/**
 * A033700 Number of connected transitive 4-valent (or quartic) graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033700 extends A002851 {

  /** Construct the sequence. */
  public A033700() {
    super(5, () -> graph -> GraphUtils.isTransitive(graph) ? 1 : 0);
    skip(degree() + 1);
  }

  @Override
  protected int degree() {
    return 4;
  }
}
