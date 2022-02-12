package irvine.oeis.a054;

import irvine.oeis.a001.A001072;

/**
 * A054317 Number of unlabeled 2-connected minimally 2-edge-connected graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A054317 extends A001072 {

  // Too slow to be useful

  @Override
  protected int connectionLevel() {
    return 2;
  }
}

