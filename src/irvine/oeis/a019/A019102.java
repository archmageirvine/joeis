package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019102.
 * @author Sean A. Irvine
 */
public class A019102 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // DAC
    return "a-1: a-11(000) b-10(0+0) a-9(0+-) c-3(0+0)\n"
      + "c-3: a-11(-00) d-8(--0) d-4(000)\n"
      + "b-2: b-12(000) b-10(0+0) a-9(0+0) d-4(0+0)\n"
      + "d-4: b-12(-00) c-7(--0)\n"
      + "d-8: b-10(0+0)\n"
      + "c-7: a-9(0+0) d-8(000)\n"
      + "a-5: b-12(-00) a-11(-0+) a-9(000) c-7(-00)\n"
      + "b-6: b-12(-00) a-11(-00) b-10(000) d-8(-00)\n";
  }
}

