package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a cube.
 * @author Sean A. Irvine
 */
class Cube extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.root(3).auxiliary() == 1;
  }
}
