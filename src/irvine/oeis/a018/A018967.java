package irvine.oeis.a018;

/**
 * A018967 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite AFT = AlPO4-52 starting with a T1 atom.
 * @author Sean A. Irvine
 */
public class A018967 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFT
    return "a-1: a-61(000) a-58(0+0) a-46(000) c-18(000)\n"
      + "c-18: c-72(000) c-69(000) b-35(000)\n"
      + "a-58: c-66(000)\n"
      + "a-61: c-69(000)\n"
      + "b-2: b-62(000) b-56(000) c-27(000) b-26(000)\n"
      + "b-26: b-44(000) b-38(000)\n"
      + "c-27: c-51(000) c-39(000) a-34(000)\n"
      + "c-3: c-63(000) c-60(000) b-26(000) a-4(000)\n"
      + "a-4: a-67(000) a-64(-00) a-49(000)\n"
      + "c-60: a-67(000)\n"
      + "c-63: a-70(000)\n"
      + "b-5: b-71(000) b-68(000) c-33(000) b-32(+0+)\n"
      + "b-32: b-47(000) b-41(000)\n"
      + "c-33: c-54(000) c-42(000)\n"
      + "c-6: c-69(000) c-66(000) b-32(000) a-7(000)\n"
      + "a-7: a-58(000) a-55(--0) a-52(000)\n"
      + "a-55: c-72(000)\n"
      + "b-8: b-62(000) b-59(000) c-24(000) b-23(0+0)\n"
      + "b-23: b-50(000) b-44(000)\n"
      + "c-24: c-45(000) c-39(000) a-31(000)\n"
      + "c-9: c-60(000) c-57(000) b-23(000) a-10(000)\n"
      + "a-10: a-70(0-0) a-64(000) a-37(000)\n"
      + "c-57: a-64(000)\n"
      + "a-37: c-54(000)\n"
      + "b-11: b-68(000) b-65(000) c-30(000) b-29(00+)\n"
      + "b-29: b-53(000) b-47(000)\n"
      + "c-30: c-48(000) c-42(000)\n"
      + "c-12: c-72(000) c-66(000) b-29(000) a-13(000)\n"
      + "a-13: a-61(+00) a-55(000) a-40(000)\n"
      + "b-14: b-59(000) b-56(000) c-21(000) b-20(-00)\n"
      + "b-20: b-50(000) b-38(000)\n"
      + "c-21: c-51(000) c-45(000) a-28(000)\n"
      + "c-15: c-63(000) c-57(000) b-20(000) a-16(000)\n"
      + "a-16: a-70(000) a-67(++0) a-43(000)\n"
      + "b-17: b-71(000) b-65(000) c-36(000) b-35(0-+)\n"
      + "b-35: b-53(000) b-41(000)\n"
      + "c-36: c-54(000) c-48(000)\n"
      + "a-19: a-67(000) a-49(000) a-43(--0) c-36(000)\n"
      + "b-38: c-63(000) b-62(000)\n"
      + "b-50: c-57(000) b-56(+00)\n"
      + "a-28: a-61(000) a-46(000) a-40(-00)\n"
      + "c-45: b-59(000) a-46(000)\n"
      + "c-51: b-56(000) a-52(000)\n"
      + "a-22: a-70(000) a-43(000) a-37(0+0) c-30(000)\n"
      + "b-44: c-60(000) b-59(0-0)\n"
      + "a-31: a-55(000) a-52(++0) a-40(000)\n"
      + "c-39: b-62(000) a-40(000)\n"
      + "a-25: a-64(000) a-49(+00) a-37(000) c-33(000)\n"
      + "a-34: a-58(000) a-52(000) a-46(0-0)\n"
      + "b-47: c-66(000) b-65(00-)\n"
      + "b-53: c-72(000) b-71(0+-)\n"
      + "c-42: b-68(000) a-43(000)\n"
      + "c-48: b-65(000) a-49(000)\n"
      + "b-41: c-69(000) b-68(-0-)\n"
      + "c-54: b-71(000)\n";
  }

  @Override
  protected String startNode() {
    return "b-2";
  }
}

