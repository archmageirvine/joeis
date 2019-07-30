package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.a007.A007528;

/**
 * A024944.
 * @author Sean A. Irvine
 */
public class A024944 extends A024941 {

  @Override
  protected Sequence seq() {
    return new A007528();
  }

  {
    next();
  }
}
