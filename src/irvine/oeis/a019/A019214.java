package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019214 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite RON = Roggianite Ca16[ Be8Al16Si32O104(OH)16 ] . 19 H2O.
 * @author Sean A. Irvine
 */
public class A019214 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // RON
    return "a-1: d-19(000) c-18(000) b-14(-00) c-3(000)\n"
      + "c-3: c-24(--0) c-15(-0-) c-7(0-0)\n"
      + "b-14: c-24(0-0) b-20(000) d-16(00-)\n"
      + "c-18: c-24(000) b-23(000) d-22(00-)\n"
      + "d-19: c-24(000)\n"
      + "b-2: b-26(--0) d-25(000) a-5(000) d-4(000)\n"
      + "d-4: d-25(000)\n"
      + "a-5: b-23(000) b-20(000) c-7(0-0)\n"
      + "d-25: d-28(000)\n"
      + "c-7: b-26(-00) c-11(-0-)\n"
      + "c-15: c-27(0-0)\n"
      + "b-20: b-26(000)\n"
      + "b-23: b-26(000)\n"
      + "b-6: d-28(-00) b-17(000) a-9(0+0) d-8(00+)\n"
      + "d-8: b-17(00-)\n"
      + "a-9: d-25(000) c-21(000) c-11(--0)\n"
      + "b-17: c-27(000)\n"
      + "c-11: d-28(000) c-15(0+0)\n"
      + "c-21: d-28(000) b-23(00+) d-22(000)\n"
      + "b-10: c-27(000) d-19(000) a-13(++0) d-12(000)\n"
      + "d-12: d-19(000)\n"
      + "a-13: d-22(000) b-17(000) c-15(-00)\n"
      + "d-22: c-27(000)\n"
      + "d-16: b-20(00+)\n";
  }
}

