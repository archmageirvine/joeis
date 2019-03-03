package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019061.
 * @author Sean A. Irvine
 */
public class A019061 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // THO
    return "a-1: a-9(-00) b-5(0-0) c-3(000) b-2(000)\n"
      + "b-2: b-5(000) a-4(000) c-3(00-)\n"
      + "c-3: b-5(0-+) a-4(000)\n"
      + "a-9: b-10(000)\n"
      + "a-4: a-6(000) b-5(0-0)\n"
      + "a-6: b-10(000) c-8(000) b-7(0-0)\n"
      + "b-7: b-10(000) a-9(0+0) c-8(0++)\n"
      + "c-8: b-10(00-) a-9(000)\n";
  }
}

