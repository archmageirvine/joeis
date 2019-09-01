package irvine.oeis.a000;

import irvine.oeis.a025.A025422;

/**
 * A000164 Number of partitions of n into 3 squares (allowing part zero).
 * @author Sean A. Irvine
 */
public class A000164 extends A025422 {

  @Override
  protected int numSquares() {
    return 3;
  }
}

