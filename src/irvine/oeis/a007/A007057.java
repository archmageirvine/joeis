package irvine.oeis.a007;

import irvine.oeis.Sequence;
import irvine.oeis.a187.A187274;

/**
 * A007057.
 * @author Sean A. Irvine
 */
public class A007057 extends A007055 {

  @Override
  protected Sequence r() {
    return new A187274();
  }
}
