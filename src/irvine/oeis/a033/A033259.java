package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.a085.A085984;

/**
 * A033259 Decimal expansion of Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033259 extends A085984 {

  @Override
  protected CR getCR() {
    return ComputableReals.SINGLETON.pow(super.getCR(), 2).subtract(CR.ONE).sqrt();
  }
}

