package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019239 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite STI = Stilbite Na4Ca8[ Al20Si52O144 <code>] . 56</code> H2O.
 * @author Sean A. Irvine
 */
public class A019239 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // STI
    return "a-1: b-14(000) b-10(000) b-6(000) b-2(000)\n"
      + "b-2: a-9(0--) d-4(00-) c-3(-00)\n"
      + "b-6: d-8(000) c-7(0-0)\n"
      + "b-10: b-18(0--) d-12(0-0) c-11(000)\n"
      + "b-14: d-16(-00) c-15(00-)\n"
      + "c-3: d-16(000) c-11(000) a-5(00-)\n"
      + "d-4: c-15(000) d-8(000) a-5(-00)\n"
      + "a-9: a-17(000)\n"
      + "a-5: a-17(000) b-6(+00)\n"
      + "c-11: a-13(0-0)\n"
      + "d-16: b-18(00-)\n"
      + "d-8: c-11(000) a-9(0-0)\n"
      + "c-15: b-18(-00)\n"
      + "a-17: b-18(000)\n"
      + "c-7: c-15(000) d-12(000) a-9(000)\n"
      + "d-12: d-16(000) a-13(000)\n"
      + "a-13: a-17(000) b-14(+00)\n";
  }
}

