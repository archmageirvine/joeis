package irvine.oeis.a048;

import irvine.oeis.a033.A033068;

/**
 * A048406 Numbers whose consecutive digits differ by 4.
 * @author Sean A. Irvine
 */
public class A048406 extends A033068 {

  @Override
  protected int base() {
    return 10;
  }

  @Override
  protected long diff() {
    return 4;
  }

  @Override
  protected long start() {
    return 0;
  }
}
