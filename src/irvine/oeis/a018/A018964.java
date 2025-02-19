package irvine.oeis.a018;

/**
 * A018964 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite AFS = MAPSO-46 starting with a T3 atom.
 * @author Sean A. Irvine
 */
public class A018964 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFS
    return "a-1: a-50(000) b-12(000) c-3(000) b-2(000)\n"
      + "b-2: b-54(0-0) b-38(000) a-7(000)\n"
      + "c-3: c-24(00-) a-11(000) a-7(000)\n"
      + "b-12: b-56(000) b-33(000)\n"
      + "a-50: b-56(000) c-52(000) b-51(000)\n"
      + "a-7: a-55(0-0) b-8(000)\n"
      + "b-38: a-41(000)\n"
      + "b-54: a-55(000)\n"
      + "a-11: a-53(+00) b-12(000)\n"
      + "c-24: a-27(000) a-25(000)\n"
      + "a-4: a-43(-00) b-14(000) c-6(000) b-5(000)\n"
      + "b-5: b-47(000) b-40(000) a-9(000)\n"
      + "c-6: c-17(000) a-13(000) a-9(000)\n"
      + "b-14: b-49(-00) b-36(000)\n"
      + "a-43: b-49(000) c-45(000) b-44(000)\n"
      + "a-9: a-48(000) b-10(000)\n"
      + "b-47: a-48(000)\n"
      + "a-13: a-46(0+0) b-14(000)\n"
      + "c-17: a-20(000) a-18(000)\n"
      + "b-8: b-51(+00) b-42(000) a-11(000)\n"
      + "a-55: b-56(000)\n"
      + "b-51: a-53(000)\n"
      + "b-10: b-44(0+0) b-30(000) a-13(000)\n"
      + "a-48: b-49(000)\n"
      + "b-30: a-35(000)\n"
      + "b-44: a-46(000)\n"
      + "a-53: b-54(000)\n"
      + "b-33: a-37(000)\n"
      + "a-46: b-47(000)\n"
      + "b-36: a-39(000)\n"
      + "a-15: a-32(-00) b-21(000) c-17(000) b-16(000)\n"
      + "b-16: b-54(000) b-38(0+0) a-18(000)\n"
      + "b-21: b-51(000) b-42(-00)\n"
      + "a-32: b-42(000) c-34(000) b-33(000)\n"
      + "a-18: a-41(0+0) b-19(000)\n"
      + "a-20: a-37(000) b-21(000)\n"
      + "b-19: b-56(000) b-33(000) a-20(000)\n"
      + "a-41: b-42(000)\n"
      + "a-37: b-38(000)\n"
      + "a-22: a-29(000) b-28(000) c-24(000) b-23(000)\n"
      + "b-23: b-49(000) b-36(+00) a-25(000)\n"
      + "b-28: b-47(000) b-40(000)\n"
      + "a-29: b-40(000) c-31(000) b-30(000)\n"
      + "a-25: a-39(+00) b-26(000)\n"
      + "a-27: a-35(0-0) b-28(000)\n"
      + "b-26: b-44(000) b-30(0-0) a-27(000)\n"
      + "a-39: b-40(000)\n"
      + "a-35: b-36(000)\n"
      + "c-31: c-52(00+) a-39(000) a-35(000)\n"
      + "c-52: a-55(000) a-53(000)\n"
      + "c-34: c-45(000) a-41(000) a-37(000)\n"
      + "c-45: a-48(000) a-46(000)\n";
  }

  @Override
  protected String startNode() {
    return "c-3";
  }
}

