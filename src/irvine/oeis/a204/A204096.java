package irvine.oeis.a204;

import irvine.oeis.a051.A051018;

/**
 * A204096 Numbers that are 5-persistent but not 6-persistent.
 * @author Sean A. Irvine
 */
public class A204096 extends A051018 {

  @Override
  protected int persistence() {
    return 5;
  }
}
