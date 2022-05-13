package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.oeis.a085.A085984;

/**
 * A033259 Decimal expansion of Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033259 extends A085984 {

  @Override
  public CR getCR() {
    return super.getCR().square().subtract(CR.ONE).sqrt();
  }
}

