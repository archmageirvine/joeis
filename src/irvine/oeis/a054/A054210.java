package irvine.oeis.a054;

import irvine.util.Triple;

/**
 * A054200.
 * @author Sean A. Irvine
 */
public class A054210 extends A054208 {

  @Override
  protected long select(final Triple<Long> t) {
    return t.right();
  }
}

