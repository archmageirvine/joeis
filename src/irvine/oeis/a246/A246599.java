package irvine.oeis.a246;

import irvine.oeis.a006.A006714;

/**
 * A246599 Number of connected trivalent bipartite labeled graphs with <code>2n</code> labeled nodes.
 * @author Sean A. Irvine
 */
public class A246599 extends A006714 {

  @Override
  protected int connectionLevel() {
    return 1;
  }
}
