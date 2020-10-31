package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.a036.A036412;

/**
 * A036416.
 * @author Sean A. Irvine
 */
public class A046157 extends A036412 {

  @Override
  protected CR getCR() {
    return EulerGamma.SINGLETON;
  }
}
