package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019016 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite FAU = Faujasite (Na2,Ca,Mg)29 [ Al58Si134O384 <code>] . 240</code> H2O.
 * @author Sean A. Irvine
 */
public class A019016 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // FAU
    return "a-1: a-48(000) a-46(0+-) a-45(000) a-20(00-)\n"
      + "a-20: a-41(000) a-36(000) a-35(-0+)\n"
      + "a-2: a-42(000) a-40(000) a-38(0+0) a-6(0+0)\n"
      + "a-6: a-46(000) a-45(0-+) a-34(000)\n"
      + "a-42: a-45(00+)\n"
      + "a-3: a-32(000) a-31(+00) a-29(000) a-19(000)\n"
      + "a-19: a-40(0-0) a-38(000) a-37(000)\n"
      + "a-29: a-39(000)\n"
      + "a-31: a-37(-00)\n"
      + "a-32: a-40(0-0)\n"
      + "a-4: a-41(+0-) a-39(000) a-35(000) a-9(+00)\n"
      + "a-9: a-47(000) a-31(000) a-29(-00)\n"
      + "a-35: a-48(+00)\n"
      + "a-41: a-47(00+)\n"
      + "a-5: a-41(000) a-33(-00) a-27(000) a-15(000)\n"
      + "a-15: a-47(00+) a-34(000) a-28(000)\n"
      + "a-27: a-43(000)\n"
      + "a-34: a-38(000)\n"
      + "a-7: a-40(000) a-33(000) a-27(+00) a-13(+00)\n"
      + "a-13: a-48(000) a-43(000) a-32(-+0)\n"
      + "a-8: a-37(-+0) a-36(000) a-27(000) a-16(0+0)\n"
      + "a-16: a-43(0-0) a-31(000) a-26(000)\n"
      + "a-36: a-46(0+0)\n"
      + "a-10: a-42(00-) a-39(000) a-30(000) a-14(000)\n"
      + "a-14: a-45(000) a-43(000) a-26(0+0)\n"
      + "a-11: a-46(000) a-44(-0+) a-28(000) a-24(-00)\n"
      + "a-24: a-37(000) a-36(+-0) a-25(000)\n"
      + "a-28: a-33(-00)\n"
      + "a-12: a-48(+-0) a-44(000) a-32(000) a-22(0-0)\n"
      + "a-22: a-35(000) a-30(000) a-25(0+-)\n"
      + "a-26: a-30(0-0)\n"
      + "a-17: a-44(000) a-29(000) a-28(+0-) a-23(00-)\n"
      + "a-23: a-42(000) a-39(00+) a-33(000)\n"
      + "a-18: a-47(000) a-34(00-) a-26(000) a-21(00-)\n"
      + "a-21: a-38(000) a-30(0-+) a-25(000)\n"
      + "a-25: a-44(00+)\n";
  }
}

