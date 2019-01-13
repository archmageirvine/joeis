package irvine.oeis.a007;

import irvine.math.cr.CR;

/**
 * A007337.
 * @author Sean A. Irvine
 */
public class A007337 extends A007336 {

  @Override
  protected CR getBase() {
    return CR.THREE.sqrt();
  }
}
