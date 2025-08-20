package irvine.oeis.a386;

import java.util.List;

import irvine.oeis.a381.A381847;

/**
 * A386884 a(n) is the number of distinct four-cuboid combinations that fill an n X n X n cube using only strict cuboids.
 * @author Sean A. Irvine
 */
public class A386884 extends A381847 {

  /** Construct the sequence. */
  public A386884() {
    super(4);
  }

  @Override
  protected boolean accept(final List<Cuboid> lst) {
    for (final Cuboid t : lst) {
      if (!t.isStrict()) {
        return false;
      }
    }
    return true;
  }
}
