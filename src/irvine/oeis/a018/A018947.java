package irvine.oeis.a018;

/**
 * A018947 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AET <code>= AlPO4-8 [ Al36P36O144 ]</code>.
 * @author Sean A. Irvine
 */
public class A018947 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AET
    return "a-1: d-28(000) a-25(000) e-15(000) a-11(-+0)\n"
      + "a-11: d-36(000) a-33(000)\n"
      + "e-15: a-29(000)\n"
      + "a-25: a-33(-+-)\n"
      + "b-2: d-28(0-0) b-26(000) c-23(000) b-12(000)\n"
      + "b-12: d-36(-00) b-34(000) c-31(000)\n"
      + "c-23: c-31(000)\n"
      + "b-26: b-34(00-)\n"
      + "c-3: d-28(000) c-27(000) b-22(000) c-13(000)\n"
      + "c-13: d-36(000) c-35(000) b-30(000)\n"
      + "b-22: b-30(000)\n"
      + "c-27: c-35(00-)\n"
      + "d-4: d-28(000) c-27(00+) b-26(0++) a-25(00+)\n"
      + "e-5: a-21(000) e-20(000) e-15(+-0) a-11(000)\n"
      + "e-20: a-33(00-)\n"
      + "a-21: a-29(+-0)\n"
      + "a-6: d-24(00+) a-21(000) e-20(00+) a-16(+-+)\n"
      + "a-16: d-32(00-) a-29(000)\n"
      + "b-7: c-27(00+) d-24(0++) b-22(000) b-17(00+)\n"
      + "b-17: c-35(00-) d-32(+0-) b-30(000)\n"
      + "c-8: b-26(00+) d-24(00+) c-23(000) c-18(00+)\n"
      + "c-18: b-34(00-) d-32(00-) c-31(000)\n"
      + "d-9: d-24(000) c-23(000) b-22(0-0) a-21(000)\n"
      + "e-10: a-25(00+) e-20(-++) a-16(00+) e-15(000)\n"
      + "d-14: d-36(000) c-35(00-) b-34(+0-) a-33(00-)\n"
      + "d-19: d-32(000) c-31(000) b-30(-00) a-29(000)\n";
  }

  @Override
  protected String startNode() {
    return "d-4";
  }
}

