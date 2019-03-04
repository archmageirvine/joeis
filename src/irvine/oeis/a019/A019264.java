package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019264.
 * @author Sean A. Irvine
 */
public class A019264 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // YUG
    return "a-1: b-6(0-+) a-5(0-0) a-3(000) b-2(000)\n"
      + "b-2: b-8(000) a-5(0-+) b-4(00+)\n"
      + "a-3: b-8(+0-) a-7(+00) b-4(000)\n"
      + "a-5: a-7(000) b-6(000)\n"
      + "b-6: b-8(00-)\n"
      + "b-4: a-7(+0-) b-6(000)\n"
      + "a-7: b-8(000)\n";
  }
}

