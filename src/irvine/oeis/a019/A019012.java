package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019012.
 * @author Sean A. Irvine
 */
public class A019012 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // EDI
    return "a-1: a-5(00-) a-4(000) a-3(0--) b-2(000)\n"
      + "b-2: a-5(000) a-4(-00) a-3(0-0)\n"
      + "a-3: a-5(000) a-4(-++)\n"
      + "a-4: a-5(+0-)\n";
  }
}

