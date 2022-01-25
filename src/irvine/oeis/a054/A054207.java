package irvine.oeis.a054;

import irvine.util.Triple;

/**
 * A054200.
 * @author Sean A. Irvine
 */
public class A054207 extends A054205 {

  @Override
  protected long select(final Triple<Long> t) {
    return t.right();
  }
}

