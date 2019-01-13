package irvine.oeis.a007;

import irvine.oeis.Sequence;
import irvine.oeis.a187.A187273;

/**
 * A007056.
 * @author Sean A. Irvine
 */
public class A007056 extends A007055 {

  @Override
  protected Sequence r() {
    return new A187273();
  }
}
