package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019230 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite RUT = RUB-10 R4 [ B4Si32O72 ].
 * @author Sean A. Irvine
 */
public class A019230 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // RUT
    return "a-1: c-16(000) c-12(000) d-8(000) d-4(000)\n"
      + "d-4: d-17(-+0) e-5(000)\n"
      + "d-8: d-13(-+0) e-9(000)\n"
      + "c-12: d-13(0+0)\n"
      + "c-16: d-17(-00)\n"
      + "b-2: e-18(000) b-15(000) e-9(0-+) c-3(000)\n"
      + "c-3: c-16(000) a-10(000) d-4(0-0)\n"
      + "e-9: b-11(000)\n"
      + "b-15: c-16(000)\n"
      + "a-10: d-17(000) d-13(000)\n"
      + "e-5: b-15(000) e-9(00+) b-6(-0+)\n"
      + "d-17: e-18(000)\n"
      + "b-6: e-14(000) b-11(000) c-7(000)\n"
      + "c-7: c-12(000) a-10(000) d-8(+00)\n"
      + "b-11: e-18(0+-) c-12(000)\n"
      + "e-14: e-18(00-) b-15(+0-)\n"
      + "d-13: e-14(000)\n";
  }
}

