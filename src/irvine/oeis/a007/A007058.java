package irvine.oeis.a007;

import irvine.oeis.Sequence;
import irvine.oeis.a187.A187275;

/**
 * A007058.
 * @author Sean A. Irvine
 */
public class A007058 extends A007055 {

  @Override
  protected Sequence r() {
    return new A187275();
  }
}
