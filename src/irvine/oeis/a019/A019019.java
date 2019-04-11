package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019019 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite GOO = Goosecreekite Ca2 [ Al4Si12O32 <code>] . 10</code> H2O.
 * @author Sean A. Irvine
 */
public class A019019 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // GOO
    return "a-1: d-13(+00) c-12(000) d-4(0+-) c-3(00-)\n"
      + "c-3: b-11(000) e-10(+00) d-4(000)\n"
      + "d-4: b-11(0-0) b-7(+00)\n"
      + "c-12: d-13(000)\n"
      + "d-13: b-14(0+0)\n"
      + "b-2: d-13(+00) c-12(000) d-9(+00) e-5(000)\n"
      + "e-5: b-14(000) c-12(0-0) c-8(+00)\n"
      + "d-9: b-14(0+0)\n"
      + "e-10: c-15(0+0) b-11(000)\n"
      + "b-11: d-16(0+0)\n"
      + "b-7: d-16(-00) c-15(000) e-10(000)\n"
      + "c-8: b-14(000) d-9(000)\n"
      + "a-6: d-16(-00) c-15(000) d-9(0-0) c-8(000)\n"
      + "c-15: d-16(000)\n";
  }
}

