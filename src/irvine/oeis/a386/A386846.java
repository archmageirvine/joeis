package irvine.oeis.a386;

import java.util.List;

import irvine.oeis.a381.A381847;

/**
 * A386846 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386846 extends A381847 {

  /** Construct the sequence. */
  public A386846() {
    super(4);
  }

  @Override
  protected boolean accept(final List<OrderedTriple> lst) {
    for (final OrderedTriple t : lst) {
      if (t.isStrict()) {
        return false;
      }
    }
    return true;
  }
}
