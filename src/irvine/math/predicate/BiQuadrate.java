package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a cube.
 * @author Georg Fischer
 */
class BiQuadrate extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.root(4).auxiliary() == 1;
  }
}
