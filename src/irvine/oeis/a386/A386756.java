package irvine.oeis.a386;

import java.util.List;

import irvine.oeis.a381.A381847;

/**
 * A386756 a(n) is the number of sets of distinct four-cuboid combinations that fill an n X n X n cube excluding combinations that contain cube-shaped cuboids.
 * @author Sean A. Irvine
 */
public class A386756 extends A381847 {

  /** Construct the sequence. */
  public A386756() {
    super(4);
  }

  @Override
  protected boolean accept(final List<OrderedTriple> lst) {
    for (final OrderedTriple t : lst) {
      if (t.isCube()) {
        return false;
      }
    }
    return true;
  }
}
