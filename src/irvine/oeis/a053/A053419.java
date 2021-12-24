package irvine.oeis.a053;

import irvine.oeis.a339.A339063;

/**
 * A053419 Number of graphs with loops (symmetric relations) with n edges.
 * @author Sean A. Irvine
 */
public class A053419 extends A339063 {

  private static final int[] PREFIX = {1};

  @Override
  protected int[] getPrefix() {
    return PREFIX;
  }
}
